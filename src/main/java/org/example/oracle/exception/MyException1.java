package org.example.oracle.exception;

public class MyException1 extends RuntimeException {
    private String message;

    public MyException1(String message) {
        super(message);
    }
}
