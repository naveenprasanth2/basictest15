package org.example.oracle;

import lombok.Getter;

@Getter
public class Printer<T> {
   private final T numberToPrint;

    public Printer(T numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    public void print() {
        System.out.println(numberToPrint);
    }
}
