package org.example.chatgpt.generic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSubstring {
    public static void main(String[] args) {
        String value = "abcabcbb";
        Set<String> test = new HashSet<>();
        for (int i = 0; i < value.length(); i++) {
            for (int j = i; j < value.length(); j++) {
                if (Stream.of(value.substring(i, j + 1).split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().noneMatch(x -> x.getValue() >= 2)) {
                    test.add(value.substring(i, j + 1));
                }
            }
        }
        test.stream().max(Comparator.comparing(String::length)).ifPresentOrElse(System.out::println, () -> {
            throw new NoSuchElementException();
        });
    }
}
