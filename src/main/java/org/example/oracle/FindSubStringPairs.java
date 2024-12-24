package org.example.oracle;


import java.util.*;

public class FindSubStringPairs {
    public static void main(String[] args) {
        String value = "abcabc";
        Map<String, ArrayList<String>> test = new HashMap<>();
        for (int i = 0; i < value.length(); i++) {
            for (int j = i + 1; j <= value.length(); j++) {
                String temp = value.substring(i, j);
                char[] chars = temp.toCharArray();
                Arrays.sort(chars);
                String signature = new String(chars);
                test.putIfAbsent(signature, new ArrayList<>());
                test.get(signature).add(temp);
            }
        }
        test.entrySet().stream().filter(x -> x.getValue().size() > 1)
                .max(Comparator.comparingInt(x -> x.getKey().length()))
                .ifPresentOrElse(System.out::println, NoSuchElementException::new);
    }
}
