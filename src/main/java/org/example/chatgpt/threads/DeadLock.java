package org.example.chatgpt.threads;

public class DeadLock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread thread1 = new Thread(deadLock.runnable1);
        Thread thread2 = new Thread(deadLock.runnable2);
        thread1.start();
        thread2.start();
    }

    Runnable runnable1 = () -> {
        synchronized (lock1) {
            System.out.println("Thread 1, Holding lock 1...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1 waiting for lock 2...");
            synchronized (lock2) {
                System.out.println("Thread 1, Holding lock 2...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException _) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    };

    Runnable runnable2 = () -> {
        synchronized (lock2) {
            System.out.println("Thread 2 waiting for lock 2....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2 waiting for lock 1");
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException _) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    };
}
