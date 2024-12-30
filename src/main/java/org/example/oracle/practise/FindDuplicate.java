package org.example.oracle.practise;

public class FindDuplicate {
    public static void main(String[] args) {
        String name = "madam".toLowerCase();
        int count = 0;
        char[] chars = name.toCharArray();
        boolean[] seen = new boolean[256];
        for (char character : chars) {
            if (!seen[character]) {
                seen[character] = true;
                count++;
                if (count == 2) System.out.println(STR."The second character is \{character}");
            } else {
                System.out.println(character);
            }
        }
    }
}
