package org.example.xperi;

import lombok.Getter;

@Getter
public class Car implements Vehicle {
    private final String noPlate;

    public Car(String noPlate) {
        this.noPlate = noPlate;
    }
}
