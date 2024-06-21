package org.example.binary;

import java.util.Arrays;

public class Interview {
//    Count minimum steps to get the given desired array.
//    Consider an array with n elements and value of all the elements is zero. We can perform
//    following operations on the array.
//    Incremental operations:Choose 1 element from the array and increment its value by 1.
//    Doubling operation: Double the values of all the elements of array.
//
//            target[] = {2, 3}

    //    {2, 2+1}
//    Output: 4
//    target[] = {2, 1}
//    Output: 3
    public static void main(String[] args) {
        int[] target = {3, 5};
        int[] result = new int[target.length];
        int count = 0;

        if (target[0] > 0) {
            result[0] = 1;
            count++;
        }
        if (target[1] > 0) {
            result[1] = 1;
            count++;
        }

        for (int i = 0; i < target.length -1 ; i++) {
            while (target[i] >= (result[i] * 2) && target[i + 1] >= (result[i + 1] * 2)) {
                result[i] = result[i] * 2;
                result[i + 1] = result[i + 1] * 2;
                count++;
            }
            while (target[i] >= (result[i] + 1)) {
                result[i] = result[i] + 1;
                count++;
            }
            while (target[i+1] >= (result[i+1] + 1)) {
                result[i+1] = result[i+1] + 1;
                count++;
            }
        }

    }
}
