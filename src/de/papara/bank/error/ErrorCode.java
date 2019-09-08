package de.papara.bank.error;

public enum ErrorCode {
    NUMBER_OF_ACCOUNTS_EXCEEDED("You have exceeded the amount of accounts for this user");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
