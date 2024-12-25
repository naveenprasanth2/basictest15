package org.example.oracle.seal;

public non-sealed class Cat extends Animal implements AnimalInter {
    public void catSound() {
        System.out.println("Cat");
    }

    @Override
    public void summa() {
        System.out.println("summa");
    }
}
