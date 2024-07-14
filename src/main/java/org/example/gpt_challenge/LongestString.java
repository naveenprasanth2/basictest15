package org.example.gpt_challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "sa");
        Optional<String> longest = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longest.get());
        Optional<String> smallest = strings.stream().min(Comparator.comparingInt(String::length));
        System.out.println(smallest.get());
    }
}
