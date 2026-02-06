package leejun.week2;

import java.util.Stack;

public class Problem8 {

    public static void main(String[] args) {
        System.out.println(solution("(())")); // true
        System.out.println(solution("((())")); // false
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
