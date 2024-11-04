package org.example.gpt_challenge.streams;

import java.util.List;
import java.util.stream.IntStream;

public class MapToIntStreams {
    public static void main(String[] args) {
        List<Integer> test = List.of(3, 3, 5, 7, 7, 8, 10, 10, 12, 15);
        int sum = test.stream().mapToInt(Integer::intValue).sum();
        double average = test.stream().mapToInt(Integer::intValue).average().orElseThrow();
        IntStream stream = test.stream().mapToInt(Integer::intValue);
        System.out.println(sum);
        System.out.println(average);
        stream.forEach(System.out::println);
    }
}
