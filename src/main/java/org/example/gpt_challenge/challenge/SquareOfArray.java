package org.example.gpt_challenge.challenge;

import java.util.Arrays;

public class SquareOfArray {
    public static void main(String[] args) {
        int[] nums = {-11, -1, 0, 1, 2, 4};
        int low = 0;
        int high = nums.length - 1;
        int[] result = new int[nums.length];
        int pointer = nums.length - 1;

        while (low < high){
            if (Math.abs(nums[low]) > Math.abs(nums[high])){
                result[pointer--] = (int) Math.pow(nums[low++], 2);
            }else {
                result[pointer--] = (int) Math.pow(nums[high--], 2);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
