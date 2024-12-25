package org.example.oracle;

public class CheckPalindrome {
    public static void main(String[] args) {
        String name = "Madam".toLowerCase();
        int left = 0;
        int right = name.length() - 1;
        boolean isPalindrome = true;

        while (left < right){
            if (name.charAt(left) != name.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
