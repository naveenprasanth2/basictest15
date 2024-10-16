package org.example.chatgpt.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("David", "HR"),
                new Employee("Edward", "Finance")
        );

        employees.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting()))
                .entrySet().forEach(System.out::println);

        Map<Boolean, List<Employee>> val = employees.stream().collect(Collectors.partitioningBy(x -> x.department().equals("IT")));
        // Output the result
        System.out.println("Employees in IT:");
        val.get(true).forEach(System.out::println);
        // Output the result
        System.out.println("Employees not in IT:");
        val.get(false).forEach(System.out::println);
    }
}


record Employee(String name, String department) {
}