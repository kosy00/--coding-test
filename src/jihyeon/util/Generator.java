package jihyeon.util;

import java.util.Random;

public class Generator {

    // 2 ~ 100000
    public static int[] generateRandom100000Array() {
        Random random = new Random();

        // 배열 크기: 2 ~ 100000
        int size = random.nextInt(100000 - 2 + 1) + 2;

        int[] arr = new int[size];

        // 값 범위: -100000 ~ 100000
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(200001) - 100000;
        }
        return arr;
    }

    // 2 ~ 100
    public static int[] generateRandom100Array() {
        Random random = new Random();

        // 배열 크기: 2 ~ 100
        int size = random.nextInt(100 - 2 + 1) + 2;

        int[] arr = new int[size];

        // 값 범위: 0 ~ 100
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(101); // 0 ~ 100
        }
        return arr;
    }

    // 1 ~ 10000
    public static int[] generateRandom10000Array() {
        Random random = new Random();

        // 배열 크기: 1 ~ 10000
        int size = random.nextInt(10000 - 1 + 1) + 1;

        int[] arr = new int[size];

        // 값 범위: 1 ~ 5
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1, 6); // 1 ~ 5
        }
        return arr;
    }

}
