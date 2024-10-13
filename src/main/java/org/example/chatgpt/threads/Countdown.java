package org.example.chatgpt.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Latch latch1 = new Latch(countDownLatch, 1, 2000);
        Latch latch2 = new Latch(countDownLatch, 2, 1000);
        Latch latch3 = new Latch(countDownLatch, 3, 5000);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(latch1);
        executor.execute(latch2);
        executor.execute(latch3);
        countDownLatch.await();
        System.out.println("All threads completed");
        executor.shutdown();
    }
}
