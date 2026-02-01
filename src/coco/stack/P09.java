package coco.stack;

//09) 10진수를 2진수로 변환하기
//10진수를 입력받아 2진수로 변환해 반환하는 solution()함수를 구현하세요.
//*decimal: 소수

import java.util.Stack;

public class P09 {
    public static String solution(int N) {
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N % 2);
            N /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
