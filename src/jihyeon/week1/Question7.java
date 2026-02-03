package jihyeon.week1;

import java.util.HashMap;
import java.util.HashSet;

public class Question7 {
    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    public int solution(String dirs) {
        initLocation();
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>();

        // 주어진 명령어로 움직이며 좌표 저장
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny)) {
                continue;
            }
            // A에서 B로 간 경우, B에서 A도 추가 (방향성 없음)
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            // 좌표 이동 업데이트
            x = nx;
            y = ny;
        }
        return answer.size() / 2;
    }

    // 좌표 평면을 벗어나는지 체크하는 메서드
    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
}
