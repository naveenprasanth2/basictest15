package org.example.streams;

import java.util.function.Function;

public class FunctionEval {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int val = function.compose(x -> x.toString().substring(0, 2)).apply("summa");
        System.out.println(val);
    }
}
