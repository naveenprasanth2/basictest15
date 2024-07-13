package org.example.synechron;

import java.util.List;
import java.util.stream.Stream;

public class SmallestAndLargest {
    public static void main(String[] args) {
        String input  = "Program to find Smallest and Largest Word in a String";
        String[] values = input.split(" ");
        String longerString = "";
        String shorterString = values[0];
        for (int i = 0; i < values.length; i++){
            if (values[i].length() > longerString.length()){
                longerString = values[i];
            }
        }

        for (int i = 0; i < values.length; i++){
            if (values[i].length() < shorterString.length()){
                shorterString = values[i];
            }
        }

        System.out.println(shorterString);
        System.out.println(longerString);

    }
}
