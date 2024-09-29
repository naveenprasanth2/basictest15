package org.example.practise;

import java.util.List;
import java.util.Set;

public class RevVowels {
    public static void main(String[] args) {
        String value = "hello";
        char[] chars = value.toCharArray();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0, right = chars.length - 1;
        while (left < right){
            while (left < right && !vowels.contains(chars[left])){
                left++;
            }

            while (left < right && !vowels.contains(chars[right])){
                right--;
            }

            while (left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}
