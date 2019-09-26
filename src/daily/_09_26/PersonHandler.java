package daily._09_26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonHandler {
    public static void main(String[] args) {
        // Read persons from file
        Path csvFile = Paths.get("src/daily/_09_26/people.csv");
        System.out.println(Files.exists(csvFile));

        List<Person> people = new ArrayList<>();


        try {
            List<String> people_raw = Files.readAllLines(csvFile);
            // System.out.println("people_raw = " + people_raw);

            people_raw.forEach(s -> people.add(personOfLine(s)));


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("people = " + people);

        /*
        List<Person> people = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvfile.toFile()))) {
            while (reader.)
            reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
        */
    }

    private static Person personOfLine(String line) {
        // Go crazy with stream-fu! ^-^ :
        List<String> entriesOfLine = Arrays.stream(line.split(";"))
                .map(String::trim)
                .collect(Collectors.toList());
        Sex sex;
        if (entriesOfLine.get(2).equalsIgnoreCase("MALE"))
            sex = Sex.MALE;
        else if (entriesOfLine.get(2).equalsIgnoreCase("FEMALE"))
            sex = Sex.FEMALE;
        else
            sex = Sex.FEMALE; // We need this otherwise the compiler complains that sex might
        // not have been initialized

        return new Person(entriesOfLine.get(0), LocalDate.parse(entriesOfLine.get(1)), sex, entriesOfLine.get(3));
    }
}


