package org.example.oracle.practise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.example.oracle.practise.SortingForCatBat.comparator;

public class RepeatAndSort {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "mat", "bat", "cat", "mat", "dog", "mat");
        List<Map.Entry<String, Long>> test = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(comparator).toList();
        System.out.println(test);
    }
}
