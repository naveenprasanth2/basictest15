package org.example.chatgpt.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println(STR."Before Sorting \{Arrays.toString(array)}");
        mergeSort(array);
        System.out.println(STR."After Sorting \{Arrays.toString(array)}");
    }

    private static void mergeSort(int[] original) {
        if (original.length == 1) return;
        int mid = original.length / 2;
        int[] left = new int[mid];
        int[] right = new int[original.length - mid];
        System.arraycopy(original, 0, left, 0, mid);
        System.arraycopy(original, mid, right, 0, original.length - mid);
        mergeSort(left);
        mergeSort(right);
        merge(original, left, right);
    }

    private static void merge(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            if (left[i] <= right[j])
                original[k++] = left[i++];
            else
                original[k++] = right[j++];

        while (i < left.length)
            original[k++] = left[i++];

        while (j < right.length)
            original[k++] = right[j++];
    }
}
