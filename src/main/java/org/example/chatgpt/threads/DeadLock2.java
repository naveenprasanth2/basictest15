package org.example.chatgpt.threads;

public class DeadLock2 {
    static final Object object1 = new Object();
    static final Object object2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(DeadLock2::lock1);
        Thread t2 = new Thread(DeadLock2::lock2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Finally completed");
    }

    static void lock1() {
        System.out.println("Trying to acquire object 1");
        synchronized (object1) {
            System.out.println("Acquired object 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
            }
            System.out.println("Trying to acquire object 1");
            synchronized (object2) {
                System.out.println("Acquired object 2");
            }
        }
        System.out.println("Released both objects");
    }

    static void lock2() {
        System.out.println("Trying to acquire object 2");
        synchronized (object2) {
            System.out.println("Acquired object 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
            }
            System.out.println("Trying to acquire object 2");
            synchronized (object1) {
                System.out.println("Acquired object 1");
            }
        }
        System.out.println("Released both objects");
    }
}
