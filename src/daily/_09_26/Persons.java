package daily._09_26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Persons {
    public static Person of(String line) {
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

    public static List<Person> parseFile(String path) {
        List<Person> personList = null;

        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            personList = lines
                    .map(Persons::of)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }
}
