package daily._10_01;

import daily._09_26.Person;
import daily._09_26.Sex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Arrays.sort
 * Collections.sort
 * TreeSet and TreeMap
 * Stream.sorted
 * <p>
 * Comparable und Comparator
 */
public class Sort {
    public static void main(String[] args) {

        List<Person> pers = new ArrayList<>();
        pers.add(new Person("Ralph", LocalDate.of(1981, 1, 19), Sex.MALE, "ralph@stream.de"));
        pers.add(new Person("Hussam", LocalDate.of(1991, 1, 19), Sex.MALE, "hussam@stream.de"));
        pers.add(new Person("Ralph", LocalDate.of(1955, 1, 19), Sex.MALE, "ralph@stream.de"));
        pers.add(new Person("Martin", LocalDate.of(1987, 1, 19), Sex.MALE, "martin@stream.de"));
        pers.add(new Person("Olaf", LocalDate.of(2000, 1, 19), Sex.MALE, "olaf@stream.de"));
        pers.add(new Person("Wondmu", LocalDate.of(1951, 1, 19), Sex.MALE, "wondmu@stream.de"));

        /**
         * 1. Sort list with Collections.sort (natural ordering)
         * 2. Sort list with Collections (according to age from oldest to youngest)
         * 3. Sort list with Collections (according to name AND age)
         */

        // natural sorting
        Collections.sort(pers);
        System.out.println("pers = " + pers);

        // reversed:
        Collections.sort(pers, Collections.reverseOrder());
        System.out.println("pers = " + pers);
        // with comparator
        Comparator<Person> nameAndAge = (person1, person2) -> {
            if (person1.getName().equals(person2.getName()))
                return person1.compareTo(person2);
            else
                return person1.getName().compareTo(person2.getName());

        };
        // Comparator.comparing()

        Collections.sort(pers, nameAndAge.reversed());
        System.out.println(pers);

        pers.stream()
                .sorted(Comparator.comparing(Person::getName));

        Stream<Integer> integerstream = Stream.of(1, 32, 34, 5, 6, 6);
        IntStream istream = IntStream.of(1, 3, 34, 5, 6, 6, 3);
    }

}
