package org.example.reflections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cat {
    public final String name;
    public int age;

    public void meow() {
        System.out.println("Meow");
    }
}
