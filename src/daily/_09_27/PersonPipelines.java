package daily._09_27;

import daily._09_26.Person;
import daily._09_26.Persons;

import java.util.Collection;
import java.util.List;
import java.util.function.IntPredicate;

public class PersonPipelines {
    public static void main(String[] args) {
        List<Person> people = Persons.parseFile("src/daily/_09_26/people.csv");


        // List<Integer> ages = people.stream()
        //         .map(Person::getAge);

        // ages.
        // average age of minors (< 18)
        people.stream()
                .mapToInt(Person::getAge)
                .filter(age -> age < 18)
                .average()
                .ifPresent(System.out::println);

        // print out avearge age of adults
        people.stream()
                .mapToInt(Person::getAge)
                .filter(age -> age >= 18 && age < 65)
                .average()
                .ifPresent(System.out::println);

        // print out average age of seniors
        people.stream()
                .mapToInt(Person::getAge)
                .filter(age -> age >= 65)
                .average()
                .ifPresent(System.out::println);

        printAverage(people, age -> age > 10 && age <= 70);
    }

    public static void printAverage(Collection<Person> persons, IntPredicate filter) {
        persons.stream()
                .mapToInt(Person::getAge)
                .filter(filter)
                .average()
                .ifPresent(System.out::println);

    }
}
