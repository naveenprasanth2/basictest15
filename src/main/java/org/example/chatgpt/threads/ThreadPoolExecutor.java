package org.example.chatgpt.threads;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPoolExecutor {
    private final int threads;
    private final PoolWorker[] worker;
    private BlockingDeque<Runnable> queue;

    public ThreadPoolExecutor(int threads) {
        this.threads = threads;
        worker = new PoolWorker[this.threads];
        queue = new LinkedBlockingDeque<>();
        for (int i = 0; i < this.threads; i++) {
            worker[i] = new PoolWorker();
            new Thread(worker[i], STR."Thread-Pool-Worker \{i}").start();
        }

    }

    public boolean submit(Runnable runnable) {
        return queue.add(runnable);
    }
}

class PoolWorker implements Runnable {

    @Override
    public void run() {

    }
}
