package leejun.week2;

import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int result = solution(board, moves);
        System.out.println("Result: " + result); // Expected: 4
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int maxIndex = board.length - 1;
        int popped = 0;

        for (int move : moves) {
            int colIndex = move - 1;
            int rowIndex = 0;
            while (rowIndex <= maxIndex && board[rowIndex][colIndex] == 0) {
                rowIndex++;
            }

            if (rowIndex > maxIndex) {
                continue;
            }

            int val =  board[rowIndex][colIndex];
            board[rowIndex][colIndex] = 0;

            if (!basket.isEmpty() && basket.peek() == val){
                basket.pop();
                popped += 2;
            } else {
                basket.push(val);
            }
            System.out.println("basket: " + basket);
        }
        return popped;
    }
}
