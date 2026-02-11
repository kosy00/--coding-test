package jihyeon.week2;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Question10 {

    public static int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        // 닫힌 괄호: key, 열린 괄호: value
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // 회전, 기본 데이터 셋
        int n = s.length();  // 원본 데이터의 길이
        s += s;  // 회전 구현
        int answer = 0;

        A:
        for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            // 내부 반복: 시작 위치(i)부터 원본 문자열의 길이인 n개까지 올바른 괄호 문자열인지 확인
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);
                if (!map.containsKey(c)) {
                    // 열린 괄호면 stack에 추가
                    stack.push(c);
                } else {
                    // stack이 비어있는데 닫힌 괄호거나, 짝이 맞지 않으면 외부 반복으로 복귀
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }
            // 내부 반복 수행 후 stack이 비어있으면 성공
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
