package org.example.gpt_challenge;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondMostFrequent {
    public static void main(String[] args) {
        String sentence = "Banana";
        List<Map.Entry<String, Long>> test = Stream.of(sentence.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().sorted((x1, x2) -> {
                    if (!Objects.equals(x1.getValue(), x2.getValue())) {
                        return ((int) (x2.getValue() - x1.getValue()));
                    } else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).toList();
        test.stream().skip(1).findFirst().ifPresentOrElse(System.out::println, NoSuchElementException::new);
    }
}
