package daily._10_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Misc {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 34, 5, 6, 76, 42).parallel().sequential();

        stream
                .parallel()
                .peek(System.out::println)
                .map(x -> 2 * x)
                .distinct()
                .sequential()
                .sorted()
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(2, 234, 5, 6, 67, 7);
        list.parallelStream();
        list.stream();
        System.out.println(stream.isParallel());

        stream.collect(
                Collectors.partitioningBy(
                        t -> t < 100,
                        Collectors.mapping(
                                t -> t.toString(),
                                Collectors.toSet()
                        )
                )
        );


    }
}
