package jihyeon.week1;

import java.util.Arrays;
import java.util.Comparator;

public class Question2 {

    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
