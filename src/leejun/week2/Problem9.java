package leejun.week2;

import java.util.Stack;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }

    public static String solution(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int r = num % 2;
            stack.push(r);
            num /= 2;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
