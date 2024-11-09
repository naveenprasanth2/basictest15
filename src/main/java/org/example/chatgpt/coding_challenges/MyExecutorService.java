package org.example.chatgpt.coding_challenges;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyExecutorService {
    private final BlockingQueue<Runnable> blockingQueue;
    private final Thread[] workerThreads;
    private volatile boolean isShutDown = false;

    public MyExecutorService(int threadsNumber) {
        blockingQueue = new LinkedBlockingQueue<>();
        workerThreads = new Thread[threadsNumber];
        for (int i = 0; i < threadsNumber; i++) {
            workerThreads[i] = new Worker();
            workerThreads[i].start();
        }
    }

    public void submit(Runnable task) {
        if (!isShutDown) {
            blockingQueue.offer(task);
        } else {
            throw new IllegalStateException("Cannot submit new tasks - ExecutorService is shut down");
        }
    }

    public void shutDown() {
        isShutDown = true;
        for (Thread worker : workerThreads) {
            worker.interrupt(); // Signal all worker threads to check isShutDown and exit if queue is empty
        }
    }

    private class Worker extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    // Poll with timeout to check shutdown status periodically
                    Runnable task = blockingQueue.poll(500, TimeUnit.MILLISECONDS);

                    if (task != null) {
                        task.run();
                    } else if (isShutDown && blockingQueue.isEmpty()) {
                        break; // Exit if shutdown initiated and no tasks are left
                    }
                } catch (InterruptedException e) {
                    // Check if shutdown is set and queue is empty after being interrupted
                    if (isShutDown && blockingQueue.isEmpty()) {
                        break; // Exit the loop and end the thread
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(3);

        // Submit some tasks
        for (int i = 1; i <= 5; i++) {
            int taskID = i;
            executorService.submit(() -> {
                System.out.println(STR."Executing Task \{taskID} by \{Thread.currentThread().getName()}");
                try {
                    Thread.sleep(3000); // Simulate work
                    System.out.println("Waited for 3000ms");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executorService.shutDown();
    }
}
