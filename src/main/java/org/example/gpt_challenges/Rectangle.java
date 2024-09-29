package org.example.gpt_challenges;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class Rectangle extends Shape{
    private final double width;
    private final double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
