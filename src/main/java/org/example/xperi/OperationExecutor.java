package org.example.xperi;

public class OperationExecutor {
    private final Operations operations;

    public OperationExecutor(Operations operations) {
        this.operations = operations;
    }

    public int performOperation(int a, int b){
       return operations.performOperation(a, b);
    }
}
