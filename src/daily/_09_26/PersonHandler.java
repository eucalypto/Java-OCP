package daily._09_26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonHandler {
    public static void main(String[] args) {
        // Read persons from file
        Path csvFile = Paths.get("src/daily/_09_26/people.csv");
        System.out.println(Files.exists(csvFile));

        List<Person> people = new ArrayList<>();

        try {
            List<String> people_raw = Files.readAllLines(csvFile);
            // System.out.println("people_raw = " + people_raw);
            people_raw.forEach(s -> people.add(Persons.ofString(s)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("people = " + people);
    }
}


