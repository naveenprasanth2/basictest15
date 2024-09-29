package org.example.gpt_challenges;

import java.util.List;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> immutableList = List.of("Apple", "Banana", "Orange");
        immutableList.add("summa");
        System.out.println(immutableList);
    }
}
