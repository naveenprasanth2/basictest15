package org.example.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthConsecutive {
    public static void main(String[] args) {
        String name = "AtoooZzz";
        int n = 3;
        List<String> list = Stream.of(name.split("")).toList();
        list.stream().filter(x -> Collections.frequency(list, x) >= n)
                .findFirst().ifPresentOrElse(System.out::println, NoSuchElementException::new);
        List<Map.Entry<String, Long>> test = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((x1, x2) -> {
                    if (!Objects.equals(x1.getValue(), x2.getValue())) {
                        return (int) (x2.getValue() - x1.getValue());
                    } else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).toList();

        System.out.println(test);
    }
}
