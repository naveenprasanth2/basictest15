package org.example.gpt_challenge;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (test.containsKey(target - num[i])) {
                System.out.println(test.get(target - num[i]));
                System.out.println(i);
            } else {
                test.put(num[i], i);
            }
        }
    }
}
