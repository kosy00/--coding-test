package coco.배열;

import java.util.Arrays;

public class P01 {
    private static int[] solution(int[] array) {
        int[] clone = array.clone();
        Arrays.sort(clone);
        return clone;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 78})));
        System.out.println(Arrays.toString(solution(new int[]{7, 77, 777, 7777})));
        System.out.println(Arrays.toString(solution(new int[]{987, 456, 123})));
    }
}