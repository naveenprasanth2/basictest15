package org.example.oracle.seal;

public sealed abstract class Animal implements AnimalInter permits Cat, Dog {
    public void sound() {
        System.out.println("Animal");
    }

    abstract void catSound();
}
