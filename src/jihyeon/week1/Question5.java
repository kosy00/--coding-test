package jihyeon.week1;

public class Question5 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        // (M*K), (K*N) 처럼 열과 행이 같은 크기인 행렬만 서로 곱할 수 있다.
        // 행렬의 곱의 결과 크기는 M*N이고, 곱셈은 K를 기준으로 계산된다. (예시: arr1의 1행 K열 * arr2의 1열 K행)

        int r1 = arr1.length;
        int c2 = arr2[0].length;
        int key = arr1[0].length; // arr2.length도 가능

        int[][] answer = new int[r1][c2];

        // 첫 번째 행렬 arr1의 각 행과 두 번째행렬 arr2의 각 열에 대해
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // 두 행렬의 데이터를 곱해 결과 리스트에 더함
                for (int k = 0; k < key; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
