package me.code;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message) {
        super(message);
    }
}
