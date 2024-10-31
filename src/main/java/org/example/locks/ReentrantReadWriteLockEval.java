package org.example.locks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockEval {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        Cache cache = new Cache(lock);

        // Define writer and reader threads in a specific order
        Thread w1 = new Thread(() -> cache.put("name", "naveen"), "Writer-1");
        Thread r1 = new Thread(() -> System.out.println("Reader-1 read: " + cache.get("name")), "Reader-1");
        Thread r2 = new Thread(() -> System.out.println("Reader-2 read: " + cache.get("name")), "Reader-2");
        Thread w2 = new Thread(() -> cache.put("name", "naveen1"), "Writer-2");
        Thread r3 = new Thread(() -> System.out.println("Reader-3 read: " + cache.get("name")), "Reader-3");
        Thread r4 = new Thread(() -> System.out.println("Reader-4 read: " + cache.get("name")), "Reader-4");

        List<Thread> threads = List.of(w1, r1, r2, r3, r4, w2);
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        threads.forEach(executorService::execute);
        executorService.shutdown();
    }
}

class Cache {
    private final Map<String, String> map;
    private final ReentrantReadWriteLock lock;

    public Cache(ReentrantReadWriteLock lock) {
        this.map = new HashMap<>();
        this.lock = lock;
    }

    public String get(String key) {
        System.out.println(STR."\{Thread.currentThread().getName()} trying to read...");
        lock.readLock().lock(); // Acquire read lock
        try {
            System.out.println(STR."\{Thread.currentThread().getName()} reading value for key: \{key}");
            Thread.sleep(2000); // Simulate read delay
            return map.get(key);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        } finally {
            System.out.println(STR."\{Thread.currentThread().getName()} finished reading.");
            lock.readLock().unlock(); // Release read lock
        }
    }

    public void put(String key, String value) {
        System.out.println(STR."\{Thread.currentThread().getName()} trying to write...");
        lock.writeLock().lock(); // Acquire write lock
        try {
            System.out.println(STR."\{Thread.currentThread().getName()} writing value for key: \{key} -> \{value}");
            Thread.sleep(2000); // Simulate write delay
            map.put(key, value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(STR."\{Thread.currentThread().getName()} finished writing.");
            lock.writeLock().unlock(); // Release write lock
        }
    }
}
