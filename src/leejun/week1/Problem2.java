package leejun.week1;

import java.util.Arrays;
import java.util.Collections;

public class Problem2 {
    public static void main(String[] args) {
        int[] test1 = {10,100,19,100};
        int[] test2 = {7,5,3,7,9};
        int[] test3 = {1,2,99,1};
        System.out.println(Arrays.toString(solution(test1)));
        System.out.println(Arrays.toString(solution(test2)));
        System.out.println(Arrays.toString(solution(test3)));
    }

    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .distinct() // 중복 제거
                .boxed()// 내림차순 하기 위해 reference type으로 변환
                .sorted(Collections.reverseOrder()) // 내림차순
                .mapToInt(Integer::intValue) // reference -> primitive
                .toArray();
    }
}
