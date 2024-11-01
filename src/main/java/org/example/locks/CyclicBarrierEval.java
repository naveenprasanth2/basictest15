package org.example.locks;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierEval {
    public static void main() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        Thread t1 = new Thread(() -> new TeamMember(cyclicBarrier).stage1());
        Thread t2 = new Thread(() -> new TeamMember(cyclicBarrier).stage1());
        Thread t3 = new Thread(() -> new TeamMember(cyclicBarrier).stage1());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Thread> threads = List.of(t1, t2, t3);
        threads.forEach(executorService::execute);
        executorService.shutdown();
    }
}


@AllArgsConstructor
class TeamMember {
    CyclicBarrier cyclicBarrier;

    public void stage1() {
        int wait = new Random().nextInt(1000, 10000);
        try {
            Thread.sleep(wait);
        } catch (InterruptedException _) {
        } finally {
            System.out.println(STR."slept for \{wait}");
        }
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        stage2();
    }

    public void stage2() {
        System.out.println("stage 2 is called in all");
    }
}
