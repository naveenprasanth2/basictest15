package org.example.chatgpt.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserEval {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PhaserClass p1 = new PhaserClass(phaser, 1000, 1);
        PhaserClass p2 = new PhaserClass(phaser, 5000, 2);
        PhaserClass p3 = new PhaserClass(phaser, 500, 3);
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(p1);
        executorService.execute(p2);
        executorService.execute(p3);
        phaser.arriveAndAwaitAdvance();
        System.out.println("All Phaser done");
        executorService.shutdown();
    }
}
