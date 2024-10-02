package org.example.threads;

public class BinaryRecursion {
    static int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int number = 1;
    static int left = 0;
    static int right = inputArray.length - 1;

    public static void main(String[] args) {
        findNumber(left, right);
    }

    private static void findNumber(int left, int right) {
        if (left > right) return;
        int middle = (left + right) / 2;
        if (inputArray[middle] == number) {
            System.out.println(STR."The index is \{middle}");
        } else if (inputArray[middle] > number) {
             findNumber(left,  middle - 1);
        } else if (inputArray[middle] < number) {
            findNumber(middle + 1, right);
        }
    }
}
