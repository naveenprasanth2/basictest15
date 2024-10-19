package org.example.chatgpt.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeePerformance {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 5, List.of("Project1", "Project2")),
                new Employee("Bob", "HR", 3, List.of("Project3")),
                new Employee("Charlie", "IT", 4, List.of("Project1", "Project4")),
                new Employee("David", "HR", 2, List.of("Project2", "Project5")),
                new Employee("Edward", "Finance", 5, List.of("Project6")),
                new Employee("Frank", "Finance", 4, List.of("Project7", "Project8"))
        );

        // 1. Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::department));

        // 2. Find the employee with the highest performance rating per department
        Map<String, Optional<Employee>> topPerformersByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.maxBy(Comparator.comparingInt(Employee::performanceRating))));

        // 3. Flatten all the projects from all employees in each department
        Map<String, List<String>> projectsByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.flatMapping(employee -> employee.projects().stream(), Collectors.toList())));

        // 4. Partition employees into high performers (rating >= 4) and others
        Map<Boolean, List<Employee>> highPerformers = employees.stream().collect(Collectors.partitioningBy(x -> x.performanceRating() <= 4));

        // Output the results
        System.out.println("Group by Department:");
        System.out.println(employeesByDepartment);

        System.out.println("Top Performers by Department:");
        topPerformersByDepartment.forEach((department, employee) ->
                System.out.printf("Department: %s, Top Performer: %s%n", department, employee.map(Employee::name).orElse("None")));

        System.out.println("\nProjects by Department:");
        projectsByDepartment.forEach((department, projects) ->
                System.out.printf("Department: %s, Projects: %s%n", department, projects));

        System.out.println("\nHigh Performers:");
        highPerformers.get(true).forEach(employee -> System.out.printf("%s (%s): Rating %d%n", employee.name(), employee.department(), employee.performanceRating()));

        System.out.println("\nOthers:");
        highPerformers.get(false).forEach(employee -> System.out.printf("%s (%s): Rating %d%n", employee.name(), employee.department(), employee.performanceRating()));
    }
}
