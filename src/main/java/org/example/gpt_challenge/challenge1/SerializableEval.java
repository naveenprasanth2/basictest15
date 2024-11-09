package org.example.gpt_challenge.challenge1;


import java.io.*;

public class SerializableEval {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SquareOfArray squareOfArray = new SquareOfArray();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ser.ser"));
        objectOutputStream.writeObject(squareOfArray);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ser.ser"));
        SquareOfArray squareOfArray1 = (SquareOfArray) objectInputStream.readObject();
        System.out.println(squareOfArray.hashCode());
        System.out.println(squareOfArray1.hashCode());
    }
}
