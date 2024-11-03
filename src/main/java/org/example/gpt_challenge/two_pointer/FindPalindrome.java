package org.example.gpt_challenge.two_pointer;

public class FindPalindrome {
    public static void main(String[] args) {
        String input = "race a car";
        String formattedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int start = 0;
        int end = formattedInput.length() - 1;
        boolean isPalindrome = true;
        while (start < end){
            if (!(formattedInput.charAt(start) == formattedInput.charAt(end))){
                isPalindrome = false;
                break;
            }else {
                start++;
                end--;
            }
        }

        System.out.println(isPalindrome);
    }
}
