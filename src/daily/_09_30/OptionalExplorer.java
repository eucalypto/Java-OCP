package daily._09_30;


import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExplorer {
    public static void main(String[] args) {
        Optional<Integer> optionalInt = Optional.ofNullable(137);

        optionalInt.ifPresent(System.out::println);
        optionalInt.orElseGet(() -> 42);

        Stream<Integer> myStream = Stream.of(1, 3, 3, 4, 5, 5);
        // myStream.mapToInt(a -> a.intValue())
        myStream.allMatch(num -> num < 42);
        myStream.findFirst();
        myStream.findAny();
        System.out.println(myStream.reduce(0, (a, b) -> a + b));
    }
}
