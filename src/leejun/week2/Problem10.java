package leejun.week2;

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("[)(]"));
    }

    public static int solution(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            for (Character c : s.toCharArray()) {
                if (!map.containsKey(c)) { // (,{,[
                    stack.push(c);
                } else { // ),},]
                    if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) count++;
            s = s.substring(1) + s.charAt(0);
        }
        return count;
    }
}
