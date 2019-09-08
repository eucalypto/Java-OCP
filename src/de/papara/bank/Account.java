package de.papara.bank;

public class Account {
    private String iban;
    private long balance; // Amount in Euro Cent
    // For now only Euro.

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
