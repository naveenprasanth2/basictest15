package org.example.gpt_challenge;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
    public static void main(String[] args) {
        String sentence = "abcabc";
      List<Map.Entry<String, Long>> test =  Stream.of(sentence.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .toList();
        StringJoiner stringJoiner = new StringJoiner(",", "<", ">");
        test.forEach(set -> stringJoiner.add(STR."(\{set.getKey()},\{set.getValue()})"));
        System.out.println(stringJoiner);
    }
}
