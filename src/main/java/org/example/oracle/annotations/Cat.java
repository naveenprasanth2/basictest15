package org.example.oracle.annotations;

public class Cat {

    @MethodAnnotation(times = 10)
    public void summa() {
        System.out.println("summa");
    }

//    @MethodAnnotation
//    public static void summa1() {
//        System.out.println("summa1");
//    }
}
