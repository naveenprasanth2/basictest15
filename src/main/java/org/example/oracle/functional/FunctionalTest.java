package org.example.oracle.functional;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalTest {
    public static void main(String[] args) {
        Test test = new Test();
        FunctionalInterfaceDemo demo = test::test;
        demo.summa();

      Supplier<Stream<String>> supplier = () -> Stream.of("Summa");
        supplier.get().forEach(System.out::println);

        IntFunction<String> intFunction = String::valueOf;
        System.out.println(intFunction.apply(657_676_576));
    }
}
