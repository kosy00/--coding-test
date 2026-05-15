package coco.unionFind;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

//폰켓몬
public class P31 {
    public  int solution(int[] nums) {
        // 중복 제거를 위해서 hashset 활용. hashset은 객체만을 담을 수 있으므로 boxed()를 통해 int -> Integer로 포장하여 HashSet에 담아 반환
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        int n = nums.length;

        int k = n / 2;

        return Math.min(k, set.size());
    }
}
