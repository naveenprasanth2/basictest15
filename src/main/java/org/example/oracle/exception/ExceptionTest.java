package org.example.oracle.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyException("Number is not divisible");
        } catch (MyException _) {
            System.out.println("My Exception");
        } finally {
            System.out.println("summa");
        }
    }
}
