package org.example.codedecode.challenge;

public class SingletonBreakClone {
    public static void main(String[] args) {
        NormalSingleton singleton = NormalSingleton.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.clone().hashCode());
    }
}
