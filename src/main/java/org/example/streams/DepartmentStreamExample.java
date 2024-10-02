package org.example.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DepartmentStreamExample {
    public static void main(String[] args) {
        List<Employee> hrEmployees = Arrays.asList(
                new Employee("John", "HR", 45000),
                new Employee("Sara", "HR", 55000)
        );

        List<Employee> itEmployees = Arrays.asList(
                new Employee("Anna", "IT", 60000),
                new Employee("Sophia", "IT", 52000),
                new Employee("Mike", "IT", 48000)
        );

        List<Employee> financeEmployees = Arrays.asList(
                new Employee("James", "Finance", 47000),
                new Employee("Emily", "Finance", 51000)
        );

        // List of departments
        List<Department> departments = Arrays.asList(
                new Department("HR", hrEmployees),
                new Department("IT", itEmployees),
                new Department("Finance", financeEmployees)
        );

        Comparator<Employee> comparator = Comparator.comparing(Employee::name);

        List<String> employees = departments.stream().map(Department::getEmployees)
                .flatMap(Collection::stream)
                .filter(x -> x.salary() >= 50_000)
                .sorted(comparator)
                .map(Employee::name)
                .toList();

        System.out.println(employees);

    }

}
