package org.example.oracle.generic;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog Sound");
    }

    @Override
    public void summa() {
        System.out.println("Dog Summa");
    }
}
