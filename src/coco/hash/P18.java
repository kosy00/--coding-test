package coco.hash;

import java.util.HashSet;

//두 개의 수로 특정값 만들기
public class P18 {
    public boolean solution(int[]arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : arr) {
            int need = target - num;
            if (hashSet.contains(need)) {
                return true;
            } else{
                hashSet.add(num);
            }
        }
        return false;
    }

}
