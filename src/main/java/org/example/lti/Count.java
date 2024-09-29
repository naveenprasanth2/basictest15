package org.example.lti;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        String input = "HareRamHareRam";
        Map<String, Long> test = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(test);
    }

}


/**
 * Connector
 * public ResponseEntity<Employee> addEmployee();
 * public ResponseEntity<List<Employee>> getAllEmployees();
 *
 * WebClient webClient;
 *
 *
 *
 *
 * **/