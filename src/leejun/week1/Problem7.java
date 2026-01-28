package leejun.week1;

import java.util.*;

public class Problem7 {

    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
        System.out.println(solution("UD"));
    }

    private static Map<Character, int[]> location = new HashMap<>();
    private static HashSet<String> set = new HashSet<>();

    public static int solution(String dirs) {
        initMap();
        int x = 5, y = 5;
        for (int i = 0; i < dirs.length(); i++) {
            int[] xy = location.get(dirs.charAt(i));
            int nx = xy[0] + x; //위치 5,5에서 시작
            int ny = xy[1] + y;
            if (!validateDirs(nx, ny)) {
                continue;
            }
            set.add(x + " " + y + " " + nx + " " + ny);
            set.add(nx + " " + ny + " " + x + " " + y);
            // 새로운 값들 업데이트
            x = nx;
            y = ny;
        }
        return set.size() / 2;
    }

    private static void initMap() {
        location.put('U', new int[]{0,1});
        location.put('D', new int[]{0,-1});
        location.put('R', new int[]{1,0});
        location.put('L', new int[]{-1,0});
    }

    private static boolean validateDirs(int x, int y) {
        return x >= 0 && x < 11 && y >= 0 && y < 11;
    }
}
