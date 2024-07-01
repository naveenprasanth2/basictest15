package org.example.xperi;

public class Interview {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor(new Addition());
        System.out.println("10 + 5 = " + executor.performOperation(10, 5));

        executor = new OperationExecutor(new Subtraction());
        System.out.println("10 - 5 = " + executor.performOperation(10, 5));}
}
