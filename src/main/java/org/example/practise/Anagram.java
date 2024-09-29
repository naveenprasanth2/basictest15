package org.example.practise;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "peek";
        String s2 = "keep";
         if(s1.length() != s2.length()){
             System.out.println("This is not a anagram");
         }
        Map<String, Long> map1 = Stream.of(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map2 = Stream.of(s2.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2.equals(map1));
    }
}
