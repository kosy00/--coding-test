package coco.복습;

import java.util.Stack;

//짝지어 제거하기
public class Q01 {
    public int solution(String s) {
        Stack<Character> numbers = new Stack<>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!numbers.isEmpty() && numbers.peek() == s.charAt(i)) {
                numbers.pop();
            } else {
                numbers.push(s.charAt(i));
            }
        }
        return numbers.isEmpty() ? 1 : 0;
    }
}
