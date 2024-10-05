package org.example.chatgpt.threads;

public class DeadLock1 {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLock1 deadLock1 = new DeadLock1();
        Thread t1 = new Thread(deadLock1.runnable1);
        Thread t2 = new Thread(deadLock1.runnable2);
        t1.start();
        t2.start();
    }

    Runnable runnable1 = () -> {
        synchronized (lock1) {
            System.out.println("Thread 1 got lock1...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 getting lock2...");
            synchronized (lock2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };


    Runnable runnable2 = () ->{
        synchronized (lock2){
            System.out.println("Thread 2 acquired lock2...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 acquiring lock 1 ...");
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

}
