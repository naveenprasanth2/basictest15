package org.example.oracle.seal;

public sealed class Animal permits Cat, Dog {
    public void sound() {
        System.out.println("Animal");
    }

    public void catSound() {

    }
}
