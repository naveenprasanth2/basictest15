package org.example.locks;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreEval {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        PrintServer printServer = new PrintServer(semaphore);
        Thread t1 = new Thread(() -> printServer.printJob("first"));
        Thread t2 = new Thread(() -> printServer.printJob("second"));
        Thread t3 = new Thread(() -> printServer.printJob("third"));
        Thread t4 = new Thread(() -> printServer.printJob("fourth"));
        Thread t5 = new Thread(() -> printServer.printJob("fifth"));
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Thread> threads = List.of(t1, t2, t3, t4, t5);
        threads.forEach(executorService::execute);
        executorService.shutdown();
    }
}

class PrintServer {
    Semaphore semaphore;

    public PrintServer(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void printJob(String jobName) {
        try {
            semaphore.acquire();
            Thread.sleep(3000);
        } catch (InterruptedException _) {
        } finally {
            System.out.println(STR."The \{jobName} is printed");
            semaphore.release();
        }
    }
}