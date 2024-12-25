package org.example.oracle.exception;

public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        super(message);
    }
}
