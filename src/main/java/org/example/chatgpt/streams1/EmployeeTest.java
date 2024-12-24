package org.example.chatgpt.streams1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 70000.0, "IT"),
                new Employee(2, "Bob", 45000.0, "HR"),
                new Employee(3, "Charlie", 120000.0, "Finance"),
                new Employee(4, "David", 52000.0, "IT"),
                new Employee(5, "Eve", 48000.0, "HR")
        );

      List<Map.Entry<String, List<Employee>>> test = employees.stream()
              .collect(Collectors.groupingBy(Employee::department))
              .entrySet().stream().toList();

        System.out.println(test);

    }
}
