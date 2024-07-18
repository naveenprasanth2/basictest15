package org.example.challenges;

public class Child extends Parent {
    public String name = "naveen child";

    @Override
    public void test() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.name);
    }
}