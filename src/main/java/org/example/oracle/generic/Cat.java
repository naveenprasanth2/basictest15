package org.example.oracle.generic;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Cat Sound");
    }

    @Override
    public void summa() {
        System.out.println("Cat Summa");
    }
}
