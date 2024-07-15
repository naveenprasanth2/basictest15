package org.example.gpt_challenge;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 4, 2, 3};

        System.out.println(findDuplicate(nums1).getKey()); // Output: 2
        System.out.println(findDuplicate(nums2).getKey()); // Output: 3
    }

    private static Map.Entry<Integer, Long> findDuplicate(int[] nums1) {
        return Arrays.stream(nums1)
                .boxed()
                .toList()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 2).findFirst().orElseThrow(NoSuchElementException::new);
    }


}
