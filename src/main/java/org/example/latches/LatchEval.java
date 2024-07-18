package org.example.latches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LatchEval {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CountDownLatch latch = new CountDownLatch(3);
        executorService.execute(new DependantService(latch));
        executorService.execute(new DependantService(latch));
        executorService.execute(new DependantService(latch));
        latch.await();
        System.out.println("All latches counted to zero now");
        executorService.shutdown();
    }


    static class DependantService implements Runnable {
        volatile CountDownLatch latch;

        public DependantService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            latch.countDown();
            System.out.println(latch.getCount());
        }
    }
}
