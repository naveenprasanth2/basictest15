package org.example.streams;

import java.util.function.Predicate;

public class PredicateEval {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
//        boolean val = predicate.negate().and(x -> x.equalsIgnoreCase("")).test("");
        boolean val = predicate.negate().test("");
        System.out.println(val);
    }
}
