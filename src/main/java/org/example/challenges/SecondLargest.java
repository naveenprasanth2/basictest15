package org.example.challenges;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5, 3, 2, 1, -1, -25};
        mergeSort(a);
        System.out.println(a[a.length - 2]);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] array) {
        if (array.length == 1) return;
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, middle, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
