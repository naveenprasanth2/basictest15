package org.example.oracle.seal;

public final class Dog extends Animal {
    public void dogSound() {
        System.out.println("Dog");
    }

    @Override
    void catSound() {
        //do nothing
    }

    @Override
    public void summa() {
        //do nothing
    }
}
