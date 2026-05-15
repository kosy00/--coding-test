package coco.unionFind;

import java.util.ArrayList;
import java.util.Arrays;

public class P30 {

    //부모 저장을 위한 배열
    private static int[] parent;

    //루트 노드를 찾기 위한 메서드
    private static int find(int x) {
        if (parent[x] == x)
            return x;

        parent[x] = find(parent[x]);
        return parent[x];
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);
        parent [x] = y;
    }

    public static Boolean[] solution(int k, int[][] operation) {
        parent = new int[k];
        for (int i = 0; i < k; i++) {
            parent[i] = i;
        }

        ArrayList<Boolean> answer = new ArrayList<>();
        for(int[] op : operation) {
            if(op[0] == 0) {
                union(op[1],op[2]);
            }
            else {
                answer.add(find(op[1]) == find(op[2]));
            }
        }
        return answer.toArray(new Boolean[0]);
    }
}
