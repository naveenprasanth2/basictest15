package org.example.codedecode.ds;

public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        boolean isPalindrome = true;
        int left = 0;
        int right = name.length() - 1;

        while (left <= right) {
            if (name.charAt(left) == name.charAt(right)) {
                left++;
                right--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
