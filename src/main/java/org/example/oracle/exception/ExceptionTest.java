package org.example.oracle.exception;

import java.sql.SQLException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyException("Number is not divisible");
        } catch (MyException1 | MyException e) {
            System.out.println("My Exception");
        } finally {
            System.out.println("summa");
        }
    }
}
