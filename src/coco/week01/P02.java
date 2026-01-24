package coco.week01;

import java.util.Arrays;
import java.util.Collections;

//문제2) 배열 제어하기
public class P02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{100, 40, 70, 22})));
        System.out.println(Arrays.toString(solution(new int[]{5,2,3,1})));
    }

    private static int[] solution(int[] array) {
        Integer[] arr = Arrays.stream(array).boxed().distinct().toArray(Integer[]::new); // 중복값 제거
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
