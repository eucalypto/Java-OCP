package de.papara.bank.client;

import de.papara.bank.Account;
import de.papara.bank.Address;

import java.util.HashSet;
import java.util.Set;

public abstract class Client {
    private long clientId;
    private String phoneNumber;
    private String email;
    private Address address;
    private Set<Account> accounts = new HashSet<>();

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
