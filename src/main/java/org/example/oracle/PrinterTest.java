package org.example.oracle;

public class PrinterTest {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(5);
        integerPrinter.print();

        Printer<Long> longPrinter = new Printer<>(50L);
        longPrinter.print();
    }
}
