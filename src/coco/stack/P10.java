package coco.stack;

import java.util.ArrayDeque;
import java.util.HashMap;

public class P10 {
    public int solution(String s) {
        // 괄호 정보를 먼저 저장하여 코드를 반복하지 않도록 한다.
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length(); //원본 문자열 길이
        s += s; // 총 문자를 두 번 붙여서 문자열 길이만큼 이동시켰을 때 올바른지 여부 판단하기 위함
        int answer = 0; // 올바른 문자열이 되게 하는 횟수

        // 확인할 문자열의 인덱스를 시작인 0~n까지 이동 시킴
        A: for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            // 시작위치인 i부터 원본 문자열의 길이인 n까지 옆으로 옮기면서 검증. 문자열 2번 이어놨기 때문에 가능.
            for(int j = i; j < i+n; j++) {
                char c = s.charAt(j);
                // 맵 안에 키c가 없다면 열리는 괄호인것.(애초에 닫힌 괄호는 저장하지 않음)
                if (!map.containsKey(c)) {
                    stack.push(c);
                }

                // 여기서부터는 닫힌 괄호 검증.
                else {
                    //닫힌 괄호 차례인데 스택이 비어있으면 A로 돌아감
                    if (stack.isEmpty())
                        continue A;

                    // 닫힌 괄호가 pop의 결과인 열린 괄호와 pair가 아니라면 A로 돌아감
                    char open = stack.pop();
                    if (open != map.get(c)) {
                        continue A;
                    }
                }
            }
            if (stack.isEmpty())
                answer++;
        }
        return answer;
    }
}
