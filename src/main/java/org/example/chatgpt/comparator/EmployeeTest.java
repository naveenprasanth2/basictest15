package org.example.chatgpt.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 5000));
        employees.add(new Employee("Alice", 25, 6000));
        employees.add(new Employee("Bob", 35, 4500));

        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary).reversed();

        // You'll write the comparator logic for sorting here later.
        System.out.println("Before sorting:");
        employees.forEach(System.out::println);

        // Sort logic will go here (using your custom comparator)
        employees.sort(nameComparator.thenComparing(ageComparator).thenComparing(salaryComparator));
        System.out.println("After sorting:");
        employees.forEach(System.out::println);
    }
}
