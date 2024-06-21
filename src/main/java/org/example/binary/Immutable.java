package org.example.binary;

import lombok.Getter;

@Getter
public final class Immutable {
    private final String name;

    public Immutable(String name){
        this.name = name;
    }

    public Immutable clone(){
        Immutable immutable = new Immutable(name);
        return immutable;
    }
}
