package org.example.annotations;

public class CloneableBreak {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = singleton.clone();
        System.out.println(singleton1);
    }
}
