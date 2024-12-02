package org.example.codedecode.challenges;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : array1) {
            if (j <= smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j >= smallest && j <= secondSmallest) {
                secondSmallest = j;        // Update second smallest if j is greater than smallest
            }
        }

        System.out.println(secondSmallest);
    }
}
