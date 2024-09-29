package org.example.gpt_challenge;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FlatMaps {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Hello World",
                "Java is awesome",
                "Hello Java",
                "Streams are powerful"
        );

      List<String> test = sentences.stream()
              .map(x -> x.split(" "))
              .flatMap(Stream::of)
              .distinct()
              .map(String::toLowerCase)
              .sorted(Comparator.naturalOrder())
              .toList();

        System.out.println(test);
    }
}
