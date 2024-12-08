package org.example.codedecode.challenges;

public class ReverseString1 {
    public static void main(String[] args) {
        String name = "naveen";
        char[] chars = name.toCharArray();
        int left = 0;
        int right = name.length() - 1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println(String.valueOf(chars));
    }
}
