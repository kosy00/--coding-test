package coco.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// 카드 뭉치
public class P17 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        Queue<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        // goal의 개수만큼 로직이 반복되어야 함
        while(!goalDeque.isEmpty()) {
            if (!cardsDeque1.isEmpty() && cardsDeque1.peek().equals(goalDeque.peek())) {
                cardsDeque1.poll();
                goalDeque.poll();
            } else if (!cardsDeque2.isEmpty() && cardsDeque2.peek().equals(goalDeque.peek())) {
                cardsDeque2.poll();
                goalDeque.poll();
            } else {
                break;
            }
        }
        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
