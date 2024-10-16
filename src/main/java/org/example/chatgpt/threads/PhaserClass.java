package org.example.chatgpt.threads;

import java.util.concurrent.Phaser;

public class PhaserClass implements Runnable {
    private Phaser phaser;
    private int time;
    private int thread;

    public PhaserClass(Phaser phaser, int time, int thread) {
        this.phaser = phaser;
        this.time = time;
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Phaser arrived for thread " + thread);
        phaser.arrive();
    }
}
