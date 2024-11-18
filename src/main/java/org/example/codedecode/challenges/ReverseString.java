package org.example.codedecode.challenges;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        char[] chars = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            chars[index++] = s.charAt(i);
        }
        System.out.println(String.valueOf(chars));
    }
}
