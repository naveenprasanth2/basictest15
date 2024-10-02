package org.example.threads;

public class EvenOrOddUsingThread {
    volatile int number = 100;
    Runnable r1 = () -> {
        synchronized (this) {
            while (this.number > 0) {
                if (number % 2 == 0) {
                    System.out.println(STR."The number \{number} is even");
                    number--;
                    notifyAll();
                } else {
                    try {
                        wait(); // Wait until the odd thread signals
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    };

    Runnable r2 = () -> {
        synchronized (this) {
            while (this.number > 0) {
                if (number % 2 != 0) {
                    System.out.println(STR."The number \{number} is odd");
                    number--;
                    notifyAll();
                } else {
                    try {
                        wait(); // Wait until the odd thread signals
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        EvenOrOddUsingThread evenOdd = new EvenOrOddUsingThread();
        Thread t1 = new Thread(evenOdd.r1);
        Thread t2 = new Thread(evenOdd.r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Process completed");
    }
}
