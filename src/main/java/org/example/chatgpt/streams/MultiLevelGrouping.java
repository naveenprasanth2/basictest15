package org.example.chatgpt.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<Employeee> employees = List.of(
                new Employeee("Alice", "IT", "New York"),
                new Employeee("Bob", "HR", "San Francisco"),
                new Employeee("Charlie", "IT", "San Francisco"),
                new Employeee("David", "HR", "New York"),
                new Employeee("Edward", "Finance", "New York")
        );

        Map<String, Map<String, List<Employeee>>> test = employees.stream().collect(Collectors.groupingBy(Employeee::department, Collectors.groupingBy(Employeee::city)));
        test.forEach((key, value) -> {
            System.out.println(STR."Department \{key}");
            value.forEach((key1, value1) -> {
                System.out.println(STR."\t \{key1}");
                value1.forEach(z -> {
                    System.out.println(STR."\t\t \{z.name()}");
                });
            });
        });
    }

}


record Employeee(String name, String department, String city) {
}
