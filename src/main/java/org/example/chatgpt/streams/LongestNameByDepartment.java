package org.example.chatgpt.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestNameByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlotte", "IT"),
                new Employee("David", "HR"),
                new Employee("Edward", "Finance")
        );
       Map<String, Optional<Employee>> longestNameByDepartment =  employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.maxBy(Comparator.comparingInt(x -> x.name().length()))));

       longestNameByDepartment.forEach((key, value) -> System.out.println(key + value
               .orElse(new Employee("No", "No"))));
    }
}
