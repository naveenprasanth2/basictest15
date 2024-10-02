package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Department {
    private String name;
    private List<Employee> employees;
}
