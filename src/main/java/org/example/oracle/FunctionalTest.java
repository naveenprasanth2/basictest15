package org.example.oracle;

import java.util.function.Function;

public class FunctionalTest {
    public static void main(String[] args) {
        Function<String, Integer> test = String::length;
        System.out.println((length(test, "naveen")));
        System.out.println((length(test, "Naveen Prasanth")));
    }

    private static int length(Function<String, Integer> test, String summa) {
        return test.apply(summa);
    }
}
