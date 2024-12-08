package org.example.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Worker worker1 = new Worker(countDownLatch, 2000);
        Worker worker2 = new Worker(countDownLatch, 4000);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(worker1);
        executorService.execute(worker2);
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("Finally latch broken");
    }


    static class Worker implements Runnable {
        CountDownLatch latch;
        int time;

        Worker(CountDownLatch latch, int time) {
            this.latch = latch;
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println("Entered");
            try {
                Thread.sleep(time);
            } catch (InterruptedException _) {

            }
            latch.countDown();
            System.out.println("Exited");
        }
    }
}
