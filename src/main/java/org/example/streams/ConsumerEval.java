package org.example.streams;

import java.util.function.Consumer;

public class ConsumerEval {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.andThen(x -> System.out.println(STR."\{x }summa")).accept("testing");
    }
}
