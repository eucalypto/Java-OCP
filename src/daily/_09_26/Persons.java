package daily._09_26;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Persons {
    public static Person ofString(String line) {
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
