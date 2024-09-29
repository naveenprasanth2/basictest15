package org.example.gpt_challenges;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class Square extends Shape {
    private final double side;

    @Override
    public double getArea() {
        return side * side;
    }
}
