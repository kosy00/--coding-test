package coco.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class P08 {
    private boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();

        //문자열에 대하여 대상 문자가 '('와 일치한다면 push함.
        for(char c : arr) {
            if(c =='(') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty())
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
