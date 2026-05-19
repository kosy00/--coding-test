package coco.DFSBFS;

import java.util.ArrayList;

public class P34 {
    private static ArrayList<Integer>[] list;

    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    private static int[] solution(int[][] graph, int start, int n) {
        list = new ArrayList[n+1];
        for(int i =0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(int[] edge : graph) {
            list[edge[0]].add(edge[1]);
        }

        visited = new boolean[n+1];
        answer = new ArrayList<>();
        dfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int now) {
        visited[now] = true;
        answer.add(now);
        for(int next : list[now]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
