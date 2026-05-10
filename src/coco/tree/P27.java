package coco.tree;

import java.util.HashMap;
import java.util.Map;

//다단계 칫솔 판매
public class P27 {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int n = enroll.length;
        int[] answer = new int[n];

        Map<String,Integer> indexMap = new HashMap<>();
        for (int i =0; i < n; i++) {
            indexMap.put(enroll[i], i);
        }

        Map<String, String> parentMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            parentMap.put(enroll[i], referral[i]);
        }

        for(int i = 0; i < seller.length; i++) {
            String current = seller[i];  //current:현재 판매원 이름
            int profit = amount[i] * 100;  //이익금

            while (!current.equals("-") && profit >= 1) {
                int idx = indexMap.get(current);
                int toParent = profit / 10;
                answer[idx] += profit - toParent;
                profit = toParent;
                current = parentMap.get(current);
            }
        }

        return answer;
    }
}
