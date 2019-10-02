package daily._09_26;

import java.util.List;

/**
 * This class tests the helper methods from Persons. It reads Person(s) from a csv file and
 * prints them out on the command line.
 */
public class PersonHandler {
    public static void main(String[] args) {
        List<Person> people = Persons.parseFile("src/daily/_09_26/people.csv");
        System.out.println("people = " + people);
    }
}


