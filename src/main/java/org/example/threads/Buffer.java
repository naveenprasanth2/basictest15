package org.example.threads;

import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

@RequiredArgsConstructor
public class Buffer {
    private final int capacity;
    private final Queue<Integer> queue = new LinkedList<>();

    public synchronized void produce(int item) throws InterruptedException {
        if (queue.size() == capacity) {
            wait();
        }
        queue.add(item);
        System.out.println(STR."Produced: \{item}");
        notifyAll();

    }

    public synchronized int consumer() throws InterruptedException {
        if (queue.isEmpty()) {
            wait();
        }
        int item = queue.remove();
        System.out.println(STR."The consumed value is : \{item}");
        notifyAll();
        return item;
    }
}


class Producer implements Runnable{
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {

    }
}