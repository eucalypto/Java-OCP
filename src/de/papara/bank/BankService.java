package de.papara.bank;

import de.papara.bank.client.Client;
import de.papara.bank.client.PrivateClient;
import de.papara.bank.error.ErrorCode;

public final class BankService {

    private BankService() {
    }

    ;

    public static void addPrivateClient(Bank bank, PrivateClient privateClient) {
        bank.getClients().add(privateClient);
    }

    public static void addBusinessClient() {

    }

    public static void addAccount(Client client, Account account) throws BankException {
        int numberOfAccounts = client.getAccounts().size();
        if (numberOfAccounts < 10) {
            client.getAccounts().add(account);
        } else throw new BankException(ErrorCode.NUMBER_OF_ACCOUNTS_EXCEEDED);
    }

    public static void printClient(long clientID) {

    }

    public static void printClient(String firstName, String lastName) {

    }

    public static void printAccount(String iban) {

    }

    public static void printAllCustomers() {

    }

    public static void printAllCustomersSortedById() {

    }

    public static void printAllAccounts() {

    }

    public static void quit() {

    }
}
