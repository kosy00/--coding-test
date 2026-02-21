package coco.Queue;

import java.util.ArrayDeque;

// 요세푸스 문제
public class P15 {
    public int solution(int N, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            //k번째 요소를 제거함
            deque.pollFirst();
        }
        //마지막 남은 요소 반환
        return deque.pollFirst();
    }
}
