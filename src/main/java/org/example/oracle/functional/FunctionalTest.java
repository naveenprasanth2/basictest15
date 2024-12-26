package org.example.oracle.functional;

public class FunctionalTest {
    public static void main(String[] args) {
        Test test = new Test();
        FunctionalInterfaceDemo demo = test::test;
        demo.summa();
    }
}
