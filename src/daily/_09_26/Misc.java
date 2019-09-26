package daily._09_26;

import java.util.stream.Stream;

public class Misc {
    public static void main(String[] args) {
        Stream<Integer> strInteger = Stream.of(1, 2, 3, 4, 5);
        strInteger.filter(myInteger -> myInteger < 42)
                .forEach(System.out::println);

        // ----------------------------

        Stream<Integer> iStream = Stream.of(1, 2, 3, 4);
        Stream<String> sStream = Stream.empty();
        iStream.mapToInt(i -> i);
    }
}
