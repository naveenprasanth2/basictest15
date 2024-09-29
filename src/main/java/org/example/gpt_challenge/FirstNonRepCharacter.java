package org.example.gpt_challenge;

import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String sentence = "Is it your first company";
        Stream.of(sentence.toLowerCase().replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .ifPresentOrElse(System.out::println, NoSuchElementException::new);
    }
}
