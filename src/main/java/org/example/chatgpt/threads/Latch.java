package org.example.chatgpt.threads;

import java.util.concurrent.CountDownLatch;

public class Latch implements Runnable {
    private final CountDownLatch countDownLatch;
    private final int time;
    private final int number;
    public Latch(CountDownLatch latch, int number, int time) {
        this.countDownLatch = latch;
        this.time = time;
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Latch broke at thread "+ number);
        countDownLatch.countDown();
    }
}
