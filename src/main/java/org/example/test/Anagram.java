package org.example.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "peek";
        String s2 = "keep";


        Map<String, Long> s1Map = Stream.of(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> s2Map = Stream.of(s2.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(s1Map);
        System.out.println(s2Map);
        System.out.println(s1Map.equals(s2Map));
    }
}
