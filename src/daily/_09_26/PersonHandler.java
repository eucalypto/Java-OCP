package daily._09_26;

import java.util.List;

public class PersonHandler {
    public static void main(String[] args) {
        List<Person> people = Persons.parseFile("src/daily/_09_26/people.csv");
        System.out.println("people = " + people);
    }
}


