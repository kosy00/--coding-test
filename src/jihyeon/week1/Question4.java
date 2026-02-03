package jihyeon.week1;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {

    public int[] solution(int[] answers) {
        // 패턴 (1번 ~ 3번)
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 점수 저장 배열 (1번 ~ 3번)
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        // 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        // 가장 높은 점수를 받은 학생의 번호를 담아서 리스트에 담음
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
