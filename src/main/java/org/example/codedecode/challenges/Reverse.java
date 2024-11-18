package org.example.codedecode.challenges;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Reverse {
    public static void main(String[] args) throws IOException {
        String name = "naveen";
        char[] nameChars = name.toCharArray();
        char[] reversed = new char[nameChars.length];
        int index = 0;
        for (int i = nameChars.length - 1; i >= 0; i--) {
            reversed[index++] = nameChars[i];
        }
        System.out.println(String.valueOf(reversed));
    }
}
