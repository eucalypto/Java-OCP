package daily._10_02;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 3, 4, 4, 5, 65, 6, 34, 5, -234, -234, -1, -3, -42);

        //Count negative numbers:

        // sequential:
        long negativeCount1 = ints.stream()
                .peek(x -> System.out.print(x + ", "))
                .filter(x -> x < 0)
                .count();
        System.out.println(negativeCount1);

        // parallel:
        long negativeCount2 = ints.parallelStream()
                .peek(x -> System.out.print(x + ", "))
                .filter(x -> x < 0)
                .count();
        System.out.println(negativeCount2);
    }
}
