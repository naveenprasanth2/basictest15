package org.example.codedecode.challenge;

public class SingletonTest {
    public static void main(String[] args) {
        NormalSingleton singleton = NormalSingleton.getSingleton();
        System.out.println(singleton.hashCode());
    }
}
