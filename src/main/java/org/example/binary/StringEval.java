package org.example.binary;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEval {

    public static void main(String[] args) {
        String s = "string data to count each character";

        Map<String, Long> test = Stream.of(s.replaceAll("\\s+", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(test);
    }
}
