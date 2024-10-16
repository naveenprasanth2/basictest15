package org.example.challenges;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(19));
    }

    private static int fibonacciNumber(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
