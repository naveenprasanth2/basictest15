package org.example.interview2;

import java.util.HashMap;

public class ArrayChallenge {
    public static void main() {
        int[] array = {1, 2, 3, 4, 5};
        HashMap<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            test.put(array[i], i);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (test.containsKey(array[i] + test.get(array[i + 1]))) {
                System.out.println(STR."The pairs are found \{array[i]} and \{array[i + 1]}");
            }
        }
    }
}
