package de.papara.bank.client;

import java.time.LocalDate;

public class PrivateClient extends Client {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (o == this) return true;

        if (o.getClass() != this.getClass()) return false;

        PrivateClient other = (PrivateClient) o;
        return other.getEmail().equals(this.getEmail()) || other.getClientId() == this.getClientId();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
