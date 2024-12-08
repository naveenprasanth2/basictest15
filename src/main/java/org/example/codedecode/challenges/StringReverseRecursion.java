package org.example.codedecode.challenges;

public class StringReverseRecursion {
    public static void main(String[] args) {
        String name = "naveen";
        System.out.println(reverseString(name));
    }

    private static String reverseString(String value) {
        if (value.length() == 1) return value;
        return value.charAt(value.length() - 1) + reverseString(value.substring(0, value.length() - 1));
    }
}
