package org.example.codedecode.annotations;

public class TestClass {

    @MethodAnnotation(times = 10)
    public void test() {
        System.out.println("summa");
    }
}
