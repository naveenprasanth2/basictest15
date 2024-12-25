package org.example.oracle.generic;

public class GenericTest {
    public static void main(String[] args) {
        Printer<Cat> catPrinter = new Printer<>(new Cat());
        catPrinter.print();
    }
}
