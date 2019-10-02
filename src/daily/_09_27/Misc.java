package daily._09_27;

import daily._09_26.Person;
import daily._09_26.Persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Misc {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Stream<Integer> integerStream = Arrays.stream(new Integer[]{1, 2, 3, 4, 4, 5});
        // Arrays.stream() is overloaded to take any form of array and give the
        // correct stream.

        // integerStream.map()

        List<Person> persons = new ArrayList<>();
        persons.add(Persons.of("Alice; 1989-10-11;FEMALE;alice@gmail.com"));
        persons.add(Persons.of("Bob; 1990-01-04;MALE;bob@bobiverse.com"));

        IntStream mystream = persons.stream()
                .mapToInt(Person::getAge)
                .filter(age -> age < -1);

        System.out.println(mystream.equals(IntStream.empty()));

    }
}
