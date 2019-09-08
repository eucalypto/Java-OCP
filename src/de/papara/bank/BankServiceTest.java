package de.papara.bank;

import de.papara.bank.client.Client;
import de.papara.bank.client.PrivateClient;
import de.papara.bank.error.ErrorCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankServiceTest {

    @Test
    void addAccount() throws BankException {
        Client privateClient = buildClient();
        Account account = buildAccount();

        assertTrue(privateClient.getAccounts().size() == 0);

        BankService.addAccount(privateClient, account);

        assertTrue(privateClient.getAccounts().size() == 1);

        Account account2 = privateClient.getAccounts().iterator().next();
        assertTrue(account2.equals(account));

    }

    @Test
    void addAccount_numberOfAccountsExceeded() throws BankException {
        Client privateClient = buildClient();
        Account account = buildAccount();
        for (int i = 0; i < 10; i++) {
            BankService.addAccount(privateClient, buildAccount());
        }

        BankException e = assertThrows(BankException.class, () -> BankService.addAccount(privateClient, buildAccount()));
        assertTrue(e.errorCode == ErrorCode.NUMBER_OF_ACCOUNTS_EXCEEDED);
    }

    Client buildClient() {
        PrivateClient privateClient = new PrivateClient();
        return privateClient;
    }

    Account buildAccount() {
        Account account = new Account();
        return account;
    }

}
