package jihyeon.week2;

import java.util.Stack;

public class Question9 {
    public static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        // 10진수 -> 2진수 변환하여 stack에 저장
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return answer.toString();
    }
}
