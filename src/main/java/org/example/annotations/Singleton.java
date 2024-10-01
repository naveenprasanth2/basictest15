package org.example.annotations;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private Singleton() {
    }

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
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
