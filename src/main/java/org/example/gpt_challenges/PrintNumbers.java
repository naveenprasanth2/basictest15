package org.example.gpt_challenges;

import java.util.Arrays;

public class PrintNumbers {
    public static void main(String[] args) {
        Object[] objects = new Object[100];
        Arrays.fill(objects, new Object() {
            int i = 0;
            @Override
            public String toString() {
                return String.valueOf(i++);
            }
        });
        System.out.println(Arrays.toString(objects));
    }
}
