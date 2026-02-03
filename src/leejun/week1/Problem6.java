package leejun.week1;

import java.util.*;
import java.util.Map.Entry;

public class Problem6 {
  public static void main(String[] args) {

    System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    System.out.println(Arrays.toString(solution(5, new int[]{3,3,3,3,3})));
  }

  public static int[] solution(int N, int[] stages) {
    int[] challengers = new int[N+2];
    for (int i = 0; i < stages.length; i++) {
      int stage = stages[i];
      challengers[stage] += 1;
    }

    Map<Integer, Double> map = new HashMap<>();
    int totalPlayers = stages.length;
    for (int i = 1; i <= N; i++) {
      int failureNum = challengers[i];
      if (totalPlayers > 0) {
        map.put(i, (double) failureNum / totalPlayers);
      } else {
        map.put(i, 0.0);
      }
      totalPlayers -= failureNum;
    }

    List<Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
    list.sort((e1, e2) -> {
      int result = Double.compare(e2.getValue(), e1.getValue());
      if (result == 0) {
        return Integer.compare(e1.getKey(), e2.getKey());
      }
      return result;
    });

    return list.stream()
        .mapToInt(Map.Entry::getKey)
        .toArray();
  }
}
