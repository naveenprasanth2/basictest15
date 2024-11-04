package org.example.gpt_challenge.two_pointer;

import java.util.Arrays;

public class SquareOfArray {
    public static void main(String[] args) {
        int[] nums = {-11, -1, 0, 1, 2, 4};
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int pointer = result.length - 1;

        while (start < end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])){
                result[pointer--] = (int) Math.pow(nums[start++], 2);
            }else {
                result[pointer--] = (int) Math.pow(nums[end--], 2);
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
