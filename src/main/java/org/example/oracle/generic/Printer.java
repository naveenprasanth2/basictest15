package org.example.oracle.generic;

public class Printer<T extends Animal> {
    T animal;

    public Printer(T animal){
        this.animal = animal;
    }

    public void print(){
        animal.summa();
        animal.sound();
    }
}
