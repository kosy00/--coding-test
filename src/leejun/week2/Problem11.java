package leejun.week2;

import java.util.Stack;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa")); // 1
        System.out.println(solution("cdcd")); // 0
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
