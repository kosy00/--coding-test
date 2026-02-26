package coco.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class P16 {
    public int[] solution(int [] progresses, int [] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();

        int n = progresses.length;
        int[] dayLeft = new int[n];
        for (int i = 0; i < n; i++) {
            dayLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0;
        int maxDay = dayLeft[0]; //가장 앞에 있는 작업이 기준이 됨.
        for (int i =0; i <n; i++) {
            if(maxDay >= dayLeft[i]) {
                count++;
            } else {
                queue.add(count);
                count = 1;
                maxDay = dayLeft[i];
            }
        }
        queue.add(count);
        return queue.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
