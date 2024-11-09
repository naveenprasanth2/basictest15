package org.example.chatgpt.coding_challenges;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimpleExecutorService {

    private final BlockingQueue<Runnable> taskQueue;
    private final Thread[] workerThreads;
    private volatile boolean isShutdown = false;

    public SimpleExecutorService(int numThreads) {
        taskQueue = new LinkedBlockingQueue<>();
        workerThreads = new Thread[numThreads];

        // Start worker threads
        for (int i = 0; i < numThreads; i++) {
            workerThreads[i] = new Worker();
            workerThreads[i].start();
        }
    }

    // Method to submit a task
    public void submit(Runnable task) {
        if (!isShutdown) {
            taskQueue.add(task);
        } else {
            throw new IllegalStateException("Executor has been shut down.");
        }
    }

    // Method to shut down the executor service
    public void shutdown() {
        isShutdown = true;
        for (Thread worker : workerThreads) {
            worker.interrupt(); // Interrupt each worker to signal shutdown
        }
    }

    // Worker class to take tasks from the queue and execute them
    private class Worker extends Thread {
        @Override
        public void run() {
            while (!isShutdown || !taskQueue.isEmpty()) {
                try {
                    Runnable task = taskQueue.take(); // Take task from the queue
                    task.run(); // Execute the task
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Allow thread to exit on shutdown
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleExecutorService executorService = new SimpleExecutorService(3);

        // Submit some tasks
        for (int i = 1; i <= 5; i++) {
            int taskID = i;
            executorService.submit(() -> {
                System.out.println(STR."Executing Task \{taskID} by \{Thread.currentThread().getName()}");
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executorService.shutdown();
    }
}
