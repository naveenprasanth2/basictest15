package org.example.threads;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 2, 3, 4, 5, 5, 6, 100, 99, 1, 0};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int small = array[i];
            int index = 0;
            boolean isSmall = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < small) {
                    isSmall = true;
                    small = array[j];
                    index = j;
                }
            }
            if (isSmall){
                array[index] = array[i];
                array[i] = small;
            }

        }
    }
}
