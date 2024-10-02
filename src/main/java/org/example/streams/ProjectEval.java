package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectEval {
    public static void main(String[] args) {
        // Sample tasks for each project
        List<Task> projectATasks = List.of(
                new Task("Design module", true, 3),
                new Task("Implement feature", false, 5),
                new Task("Write tests", true, 4),
                new Task("Deploy app", true, 2)
        );

        List<Task> projectBTasks = List.of(
                new Task("Gather requirements", true, 1),
                new Task("Create mockups", true, 2),
                new Task("Implement feature", true, 4),
                new Task("Write documentation", true, 5)
        );

        List<Task> projectCTasks = List.of(
                new Task("Set up database", false, 3),
                new Task("Implement API", false, 4),
                new Task("Write tests", false, 2),
                new Task("Deploy app", false, 1)
        );

        // Create projects with tasks
        List<Project> projects = List.of(
                new Project("Project A", projectATasks),
                new Project("Project B", projectBTasks),
                new Project("Project C", projectCTasks)
        );


        projects.stream()
                .filter(x -> ((double) x.getTasks().stream()
                        .filter(Task::isCompleted).count() /x.getTasks().size()) > 0.8)
                .flatMap(x -> x.getTasks().stream())
                .sorted((x1, x2) -> x2.priority() - x1.priority())
                .collect(Collectors.groupingBy(Task::isCompleted))
                .entrySet().forEach(System.out::println);

    }
}


@AllArgsConstructor
@Getter
class Project{
    private String name;
    private List<Task> tasks;
}

record Task(String description, boolean isCompleted, int priority) {
} // Higher number means higher priority)
