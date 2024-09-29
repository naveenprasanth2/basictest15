package org.example.gpt_challenges;

public abstract sealed class Shape permits Circle, Square, Rectangle{
    public abstract double getArea();
}
