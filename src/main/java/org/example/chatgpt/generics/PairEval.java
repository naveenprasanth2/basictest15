package org.example.chatgpt.generics;

public class PairEval {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        Pair<Integer, String> pair2 = new Pair<>(2, "Banana");

        System.out.println(pair1.getFirst());  // Output: 1
        System.out.println(pair1.getSecond()); // Output: "Apple"

        Pair<String, Integer> swapped = pair1.swap();
        System.out.println(swapped.getFirst());  // Output: "Apple"
        System.out.println(swapped.getSecond()); // Output: 1

        int comparison = Pair.compare(pair1, pair2); // Compare based on the first value
        System.out.println(comparison); // Output: -1 because 1 < 2

    }
}
