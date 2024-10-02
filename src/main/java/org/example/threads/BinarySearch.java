package org.example.threads;

public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findNumber(100, inputArray));
        System.out.println(findNumber(1, inputArray));
    }

    private static int findNumber(int number, int[] inputArray) {
        int left = 0;
        int right = inputArray.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (inputArray[middle] == number) {
                return middle;
            } else if (inputArray[middle] < number) {
                left = middle + 1;
            }
            if (inputArray[middle] > number) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
