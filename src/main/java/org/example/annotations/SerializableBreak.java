package org.example.annotations;

import java.io.*;

public class SerializableBreak {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial.ser"));
        objectOutputStream.writeObject(singleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial.ser"));
        Singleton singleton1 = (Singleton) (objectInputStream.readObject());

        System.out.println(singleton1);
    }
}
