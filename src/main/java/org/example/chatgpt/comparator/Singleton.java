package org.example.chatgpt.comparator;

public class Singleton {
    private Singleton() {
    }

    private static final class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
