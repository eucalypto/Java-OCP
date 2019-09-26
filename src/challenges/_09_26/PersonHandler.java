package challenges._09_26;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonHandler {
    public static void main(String[] args) {
        // Read persons from file
        Path csvfile = Paths.get("src/challenges/_09_26/people.csv");
        System.out.println(Files.exists(csvfile));

        // try (BufferedReader reader = new BufferedReader(new FileReader()))

    }
}


