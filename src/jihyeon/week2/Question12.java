package jihyeon.week2;

import java.util.Stack;

public class Question12 {
    public static int[] solution(int[] prices) {
        // 원본 배열의 길이
        int n = prices.length;
        int[] answer = new int[n];
        
        // 비교는 인덱스로
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for (int i = 1; i < n; i++) {
            // 스택이 비어있지 않고(시간이 계산되지 않음), 기존 가격이 최신 가격보다 낮다면 
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();
                // 인덱스는 1초라고 치고 가격이 내려간 시간 계산
                answer[j] = i - j;
            }
            // 스택이 비어있는데 반복이 끝나지 않았거나, 기존 가격보다 최신 가격이 더 높다면 계산 대상
            stack.push(i);
        }
        
        // 반복이 끝났는데도 스택에 값이 남아있다면
        while (!stack.isEmpty()) {
            int j = stack.pop();
            // 전체 시간(전체 길이 - 1) - j(들어온 시간)
            answer[j] = n - 1 - j;
        }
        return answer;
    }
}
