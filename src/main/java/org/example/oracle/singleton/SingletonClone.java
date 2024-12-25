package org.example.oracle.singleton;

public class SingletonClone {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Singleton singleton1 = singleton.clone();
        System.out.println(singleton1.hashCode());
    }
}
