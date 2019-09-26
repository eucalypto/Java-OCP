package challenges._09_26;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private Sex gender;
    private String emailAddress;

    public static void main(String[] args) {
    }

    public Person(String name, LocalDate dateOfBirth, Sex gender, String emailAddress) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return LocalDate.now().minusYears(dateOfBirth.getYear()).getYear();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }
}
