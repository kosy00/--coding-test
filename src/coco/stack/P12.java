package coco.stack;

import java.util.Stack;

//주식 가격
public class P12 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for( int i = 0; i < prices.length; i++ ) {
            // prices[stack.peek()]가 이전 주식 가격임
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }
        // 마지막까지 남는 것들은 가격이 떨어지지 않은 거임
        while(!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = prices.length - 1 - j;
        }
        return answer;
    }
}

// 다른 사람 풀이
//class Solution {
//    public int[] solution(int[] prices) {
//        int len = prices.length;
//        int[] answer = new int[len];
//        int i, j;
//        for (i = 0; i < len; i++) {
//            for (j = i + 1; j < len; j++) {
//                answer[i]++;
//                if (prices[i] > prices[j])
//                    break;
//            }
//        }
//        return answer;
//    }
//} -> 효율성 이슈가 있을 수는 있음