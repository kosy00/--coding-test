package leejun.week1;

import java.util.Arrays;

public class Problem5 {

  public static void main(String[] args) {
    int[][] arr1_a = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2_a = {{3, 3}, {3, 3}};
    System.out.println(Arrays.deepToString(solution(arr1_a, arr2_a)));
    int[][] arr1_b = {{-1, -2}, {2, 3}};
    int[][] arr2_b = {{3, 4}, {-1, -2}};
    System.out.println(Arrays.deepToString(solution(arr1_b, arr2_b)));
  }

  public static int[][] solution(int[][] arr1, int[][] arr2) {
    int aRow = arr1.length;
    int aCol = arr1[0].length;
    // bRow = arr2.length; // aCol과 동일
    int bCol = arr2[0].length;
    int[][] res = new int[aRow][bCol];

    for (int i = 0; i < aRow; i++) { // arr1의 row
      for (int j = 0; j < bCol; j++) { // arr2의 col
        for (int k = 0; k < aCol; k++) { // 순회하면서 곱셈, bRow = aCol
          res[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
    return res;
  }

}
