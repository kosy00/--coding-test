package jihyeon;

import jihyeon.util.Generator;
import jihyeon.week1.Question3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Generator.generateRandomSmallArray();
        Question3 q3 = new Question3();
        int[] solution = q3.solution(array);
        System.out.println(Arrays.toString(solution));
    }
}