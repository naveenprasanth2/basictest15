package org.example.codedecode.challenge;

import java.io.Serializable;

public class NormalSingleton implements Serializable, Cloneable {
    private NormalSingleton(){}
    private static NormalSingleton singleton;

    public static NormalSingleton getSingleton(){
        if (singleton == null){
            synchronized (NormalSingleton.class){
                if (singleton == null){
                    singleton = new NormalSingleton();
                }
            }
        }
        return singleton;
    }

    @Override
    public NormalSingleton clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (NormalSingleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
