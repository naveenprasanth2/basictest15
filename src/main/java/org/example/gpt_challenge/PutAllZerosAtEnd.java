package org.example.gpt_challenge;

import java.util.Arrays;

public class PutAllZerosAtEnd {
    public static void main(String[] args) {
        int[] a = {2, 3, 0, 0, 5, 0, 8};
        int index = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && i < index) {
                int temp = a[i];
                while (a[index] == 0) {
                    index--;
                }
                a[i] = a[index];
                a[index] = temp;
                index--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
