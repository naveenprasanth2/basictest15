package org.example.threads;

public class Singleton {
    private Singleton() {
    }

    private static final class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

}
