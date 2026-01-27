package leejun.week1;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] test1 = {1,2,5,4,7};
        int[] test2 = {7,5,3,7,9};
        int[] test3 = {1,2,99,5};
        System.out.println(Arrays.toString(solution(test1)));
        System.out.println(Arrays.toString(solution(test2)));
        System.out.println(Arrays.toString(solution(test3)));
    }
    
    public static int[] solution(int[] arr) {
        int[] copy = arr;
        Arrays.sort(copy);
        return arr;
    }
}
