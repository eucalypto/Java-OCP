package challenges._09_26;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapStream {
    public static void main(String[] args) {
        Map<Person, Double> grades = new HashMap<>();

        fillMap(grades);

        grades.entrySet().stream()
                .filter(person -> 2.0 <= person.getValue() && person.getValue() <= 3.3)
                // .map(entry -> entry.getKey())
                .forEach(System.out::println);


    }

    static void fillMap(Map<Person, Double> map) {
        map.put(new Person("Ned Flanders", LocalDate.of(1945, 3, 23), Sex.MALE, "ned@flanders.io"), 1.7);
        map.put(new Person("Homer Simpson", LocalDate.of(1952, 4, 24), Sex.MALE, "homer@simpson.com"), 3.0);
        map.put(new Person("Marge Simpson", LocalDate.of(1945, 3, 23), Sex.FEMALE, "ned@flanders.io"), 2.3);
        map.put(new Person("Lisa Simpson", LocalDate.of(1982, 3, 23), Sex.FEMALE, "lisa@gmail.com"), 1.0);

    }
}
