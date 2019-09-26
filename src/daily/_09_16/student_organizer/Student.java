package daily._09_16.student_organizer;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Comparable<Student>, Serializable {
    private final String name;
    private final LocalDate dateOfBirth;

    private Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public static Student of(String name, int year, int month, int dayOfMonth) {
        return new Student(name, LocalDate.of(year, month, dayOfMonth));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int compareTo(@NotNull Student other) {
        return this.name.compareTo(other.name);
    }
}
