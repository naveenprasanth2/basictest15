package org.example.binary;

public class Singleton {
    private String name;

    private Singleton() {
    }

    private static final class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
