package de.papara.bank;

import de.papara.bank.error.ErrorCode;

public class BankException extends Exception {
    ErrorCode errorCode;

    public BankException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
