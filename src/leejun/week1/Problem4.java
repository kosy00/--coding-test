package leejun.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
  }

  public static int[] solution(int[] answers) {
    int[][] patterns = {
        {1,2,3,4,5},
        {2,1,2,3,2,4,2,5},
        {3,3,1,1,2,2,4,4,5,5}
    };

    int[] count = new int[3];

    for (int i = 0; i < 3; i++) {
      int[] pattern = patterns[i];
      int cur = 0;
      int cnt = 0;
      while (cur < answers.length) {
        if (pattern[cur % pattern.length] == answers[cur]) {
          cnt++;
        }
        cur++;
      }
      count[i] = cnt;
    }

    int maxCount = Arrays.stream(count).max().getAsInt();
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < count.length; i++) {
      if (count[i] == maxCount) {
        res.add(i+1);
      }
    }
    return res.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

}
