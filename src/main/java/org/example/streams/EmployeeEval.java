package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeEval {
    public static void main(String[] args) {
        // Create some projects for employees
        List<Project1> johnProjects = List.of(
                new Project1("Website Redesign", 5, true),
                new Project1("Mobile App", 12, false),
                new Project1("Backend Refactor", 8, true)
        );

        List<Project1> annaProjects = List.of(
                new Project1("Database Migration", 6, true),
                new Project1("API Development", 7, true),
                new Project1("Frontend Redesign", 4, false)
        );

        List<Project1> mikeProjects = List.of(
                new Project1("Cloud Migration", 3, true),
                new Project1("Security Enhancement", 10, true),
                new Project1("Server Upgrade", 2, true)
        );

        // Create employees with their projects
        List<Employee1> employees = List.of(
                new Employee1("John", johnProjects),
                new Employee1("Anna", annaProjects),
                new Employee1("Mike", mikeProjects)
        );

        employees.stream()
                .filter(x -> (x.getProjects().stream().anyMatch(Project1::isCompleted)))
                .sorted((x1, x2) -> (int) (x2.getProjects().stream()
                        .filter(Project1::isCompleted).count() - x1.getProjects().stream().filter(Project1::isCompleted).count()))
                .forEach(employee -> {
                    Map<String, List<Project1>> groupedProjects = employee.getProjects()
                            .stream().collect(Collectors.groupingBy(project1 -> project1.durationInMonths() > 6 ? "Long Term" : "ShortTerm"));
                    // Print employee details
                    System.out.println(STR."Employee: \{employee.getName()}");
                    System.out.println(STR."Completed Projects: \{employee.getProjects().stream()
                            .filter(Project1::isCompleted).count()}");

                    // Print grouped projects
                    groupedProjects.forEach((durationType, projects) -> {
                        System.out.println(STR."\{durationType} Projects:");
                        projects.forEach(System.out::println);
                    });

                    System.out.println();
                });
    }
}

@AllArgsConstructor
@Getter
class Employee1 {
    private String name;
    private List<Project1> projects;
}

record Project1(String projectName, int durationInMonths, boolean isCompleted) {
}