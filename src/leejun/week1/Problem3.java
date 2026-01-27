package leejun.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem3 {

    public static void main(String[] args) {
        int[] test1 = {10,100,19,100};
        int[] test2 = {7,5,3,7,9};
        int[] test3 = {1,2,99,1};
        System.out.println(Arrays.toString(solution(test1)));
        System.out.println(Arrays.toString(solution(test2)));
        System.out.println(Arrays.toString(solution(test3)));
    }

    public static int[] solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }
        }
        return set.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
