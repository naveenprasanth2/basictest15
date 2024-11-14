package org.example.codedecode.challenges;

import java.util.Collections;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 1, 2, 3, 3, 4, 5, 6, 4, 7, 8, 9, 0, 9);

        List<Integer> finalList = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .distinct()
                .toList();

        System.out.println(finalList);
    }
}
