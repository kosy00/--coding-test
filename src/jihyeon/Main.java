package jihyeon;

import jihyeon.util.Generator;
import jihyeon.week1.Question4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Generator.generateRandom10000Array();
        Question4 q4 = new Question4();
        int[] solution = q4.solution(array);
        System.out.println(Arrays.toString(solution));
    }
}