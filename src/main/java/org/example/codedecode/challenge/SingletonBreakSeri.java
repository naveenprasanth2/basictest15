package org.example.codedecode.challenge;

import java.io.*;

public class SingletonBreakSeri {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        NormalSingleton singleton = NormalSingleton.getSingleton();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("name.ser"));
        objectOutputStream.writeObject(singleton);
        System.out.println(singleton.hashCode());
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("name.ser"));
        NormalSingleton singleton1 = (NormalSingleton) objectInputStream.readObject();
        System.out.println(singleton1.hashCode());
    }
}
