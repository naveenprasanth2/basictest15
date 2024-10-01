package org.example.annotations;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private Singleton() {
    }

    private static final class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    @Override
    public Singleton clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Singleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
