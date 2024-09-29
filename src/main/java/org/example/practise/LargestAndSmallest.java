package org.example.practise;

public class LargestAndSmallest {
    static String input  = "Program to find Smallest and LargestOne Word in a String";

    public static void main(String[] args) {
        String[] inputs = input.split(" ");
        String smallest = inputs[0];
        String largest = inputs[0];

        for (String string : inputs) {
            if (smallest.length() > string.length()) {
                smallest = string;
            }
        }

        for (String s : inputs) {
            if (largest.length() < s.length()) {
                largest = s;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
