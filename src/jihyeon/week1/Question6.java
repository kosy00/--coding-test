package jihyeon.week1;

import java.util.*;

public class Question6 {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수 구하기
        int[] challenger = new int[N + 2];

        for (int stage : stages) {
            challenger[stage] += 1;
        }

        // 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length; // 총 사용자 수

        for (int i = 1; i <= N; i++) {
            // 도전자가 없는 경우 0
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                // 도전자가 있는 경우
                fails.put(i, challenger[i] / total);
                total -= challenger[i]; // 다음 스테이지의 실패율을 구하기 위해 현재 스테이지의 인원 빼기
            }
        }

        return fails.entrySet().stream()
                .sorted((o1, o2) ->
                        o1.getValue().equals(o2.getValue()) ?
                                Integer.compare(o1.getKey(), o2.getKey()) // 값이 같다면 key 기준 오름차순
                                : Double.compare(o2.getValue(), o1.getValue()) // 값이 다르다면 value 기준 내림차순
                )
                .mapToInt(HashMap.Entry::getKey)
                .toArray();
    }
}
