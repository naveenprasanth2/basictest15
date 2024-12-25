package org.example.oracle;

public class FindRepeatedCharacters {
    public static void main(String[] args) {
        String name = "naveen";
        boolean[] bool = new boolean[256];
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (bool[c]) {
                System.out.println(c + " is a duplicate character");
            } else {
                bool[c] = true;
            }
        }
    }
}
