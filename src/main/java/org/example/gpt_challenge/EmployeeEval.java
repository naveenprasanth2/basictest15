package org.example.gpt_challenge;

import java.util.Arrays;
import java.util.List;

public class EmployeeEval {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Jack", 55000),
                new Employee("Jill", 70000),
                new Employee("Jim", 45000)
        );

        int N = 3;
        List<Employee> topPaidEmployees = findTopPaidEmployees(employees, N);
        System.out.println(topPaidEmployees);
    }

    private static List<Employee> findTopPaidEmployees(List<Employee> employees, int n) {
        return employees.stream()
                .sorted((x1, x2) -> Double.compare(x2.salary(), x1.salary()))
                .limit(n)
                .toList();
    }


}
