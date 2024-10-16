package org.example.chatgpt.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Thread t1 = new Thread(new Task(latch, 5000));
        Thread t2 = new Thread(new Task(latch, 2000));
        Thread t3 = new Thread(new Task(latch, 3000));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Awaiting");
        latch.await();
        System.out.println("All latches broken");
    }

    static class Task implements Runnable {
        private final CountDownLatch latch;
        private final int time;
        public Task(CountDownLatch latch, int time) {
            this.latch = latch;
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println("Entered into run " + time );
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latch.countDown();
            System.out.println("Latch broken");
        }
    }
}
