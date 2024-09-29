package org.example.gpt_challenge;

import java.util.HashMap;
import java.util.Map;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 5, 7, 8, 1};
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < list.length; i++){
            if (!firstOccurrence.containsKey(list[i])){
                firstOccurrence.put(list[i], i);
            }
            lastOccurrence.put(list[i], i);
        }
        System.out.println(firstOccurrence);
        System.out.println(lastOccurrence);
    }
}
