package org.example.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierEval {
    public static void main(String[] args) {
        Supplier<Stream<String>> supplier = () -> Stream.of("naveen", "prasanth");
        supplier.get().forEach(System.out::println);
    }
}
