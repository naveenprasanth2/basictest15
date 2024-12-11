package org.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);
        Worker worker1 = new Worker(phaser, 2000);
        Worker worker2 = new Worker(phaser, 4000);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(worker1);
        executorService.execute(worker2);
        phaser.arrive();
        executorService.shutdown();
        System.out.println("Finally latch broken");
    }

    static class Worker implements Runnable {
        Phaser phaser;
        int time;

        Worker(Phaser phaser, int time) {
            this.phaser = phaser;
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println("Entered");
            try {
                Thread.sleep(time);
            } catch (InterruptedException _) {

            }
            phaser.awaitAdvance(1);
            System.out.println("Exited");
        }
    }
}
