package org.example.codedecode.challenge;

public class FinalSingleton {
    private FinalSingleton() {
    }

    public FinalSingleton getSingleton() {
        return Singleton.singleton;
    }

    private static final class Singleton {
        public final static FinalSingleton singleton = new FinalSingleton();
    }
}
