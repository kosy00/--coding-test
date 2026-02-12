package coco.stack;

import java.util.Stack;

//크레인 인형 뽑기 게임
public class P13 {
    public int solution(int [][] board, int[]moves) {
        // 각 열에 대한 스택을 만들어 주는데 열과 행의 크기가 같다는 점 기억.
        Stack<Integer>[] lanes = new Stack[board.length];
        for(int i = 0; i < lanes.length; i++) {
            lanes[i] = new Stack<>();
        }

        //보드를 행 기준 역순으로 탐색하면서 각 열의 가장 아래부터 인형이 쌓이도록 함
        for (int i = board.length -1; i >= 0; i--) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] > 0) {
                    lanes[j].push(board[i][j]);
                }
            }
        }

        // 바구니 만들기
        Stack<Integer> bucket = new Stack<>();
        int answer = 0;

        for(int move: moves) {
            if(!lanes[move-1].isEmpty()) {
                int doll = lanes[move-1].pop();
                if(!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2;  //answer에 2 더해주기
                }
                else {
                    bucket.push(doll);
                }
            }
        }
        return answer;
    }

}
