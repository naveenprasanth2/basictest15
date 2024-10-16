package org.example.chatgpt.streams;

import java.util.List;

public class EmployeeFilters {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlotte", "David", "Edward");
        List<String> nameList = names.stream().filter(x -> x.length() < 5)
                .map(String::toUpperCase)
                .toList();
        System.out.println(nameList);
    }
}
