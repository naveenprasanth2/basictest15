package org.example.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog {
    @RunAnnotation
    String name;
}
