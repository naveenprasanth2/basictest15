package org.example.challenges;

import java.util.Arrays;
import java.util.List;

public class FindPairs {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        System.out.println(findPairs(a));
    }

    private static boolean findPairs(int[] a){

        if (a.length % 2 != 0) {
           return false;
        }

        List<Integer> sortedArray = Arrays.stream(a).boxed().sorted().toList();

        for (int i = 0; i < sortedArray.size() - 2; i += 2) {
            if (!sortedArray.get(i).equals(sortedArray.get(i+1))){
                return false;
            }
        }

       return true;
    }
    
    //1,1,2,2,3,3
}
