package org.example.chatgpt.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ParkingLot {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Car(semaphore, i));
        }
        executorService.shutdown();
    }

    static class Car implements Runnable {
        private final Semaphore parkingLots;
        private final int carNumber;

        public Car(Semaphore parkingLots, int carNumber) {
            this.parkingLots = parkingLots;
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            int parkingTime = new Random().nextInt(1000, 10000);
            try {
                System.out.println(STR."The car number \{carNumber} is trying to park");
                parkingLots.acquire();
                System.out.println(STR."The car with number \{carNumber} has parked");
                Thread.sleep(parkingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                parkingLots.release();
                System.out.println(STR."Car \{carNumber} has left the parking spot after \{parkingTime} ms.");
            }
        }
    }
}
