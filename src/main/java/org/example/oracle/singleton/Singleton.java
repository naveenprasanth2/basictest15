package org.example.oracle.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton ==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    @Override
    public Singleton clone() {
        try {
            return (Singleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
