package org.example.xperi;

import lombok.Getter;

@Getter
public class Bike implements Vehicle{

    private final String noPlate;

    public Bike(String noPlate) {
        this.noPlate = noPlate;
    }
}
