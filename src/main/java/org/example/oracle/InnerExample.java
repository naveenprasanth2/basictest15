package org.example.oracle;

public class InnerExample {
    class InnerClass {
        public void summa() {
            System.out.println("summa");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerExample().new InnerClass();
        innerClass.summa();
    }
}
