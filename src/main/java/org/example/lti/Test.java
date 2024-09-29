package org.example.lti;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<String, Integer> function = (String q) -> q.length();
        test(function);
    }

    private static void test(Function<String, Integer> function){
        function.apply("uhuh");
    }
}
