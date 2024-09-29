package org.example.gpt_challenges;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class Circle extends Shape {
    private final double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
