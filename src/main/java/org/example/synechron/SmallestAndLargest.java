package org.example.synechron;

public class SmallestAndLargest {
    public static void main(String[] args) {
        String input  = "Program to find Smallest and Largest Word in a String";
        String[] values = input.split(" ");
        String longerString = "";
        String shorterString = values[0];
        for (String value : values) {
            if (value.length() > longerString.length()) {
                longerString = value;
            }
        }

        for (String value : values) {
            if (value.length() < shorterString.length()) {
                shorterString = value;
            }
        }

        System.out.println(shorterString);
        System.out.println(longerString);

    }
}
