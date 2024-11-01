package org.example.locks;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEval {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        DataFetcher dataFetcher1 = new DataFetcher("inside", countDownLatch);
        DataFetcher dataFetcher2 = new DataFetcher("outside", countDownLatch);
        DataFetcher dataFetcher3 = new DataFetcher("moreOutside", countDownLatch);
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<DataFetcher> dataFetchers = List.of(dataFetcher1, dataFetcher2, dataFetcher3);
        dataFetchers.stream().map(dataFetcher -> new Thread(dataFetcher::fetchData)).forEach(service::execute);
        countDownLatch.await();
        System.out.println("All countdown completed");
    }
}


class DataFetcher {
   private final String location;
   private final CountDownLatch countDownLatch;

    public DataFetcher(String location, CountDownLatch countDownLatch) {
        this.location = location;
        this.countDownLatch = countDownLatch;
    }

    public void fetchData() {
        int time = 0;
        switch (location) {
            case "inside" -> time = 2000;
            case "outside" -> time = 3000;
            case "moreOutside" -> time = new Random().nextInt(4000, 10000);
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            countDownLatch.countDown();
            System.out.println(STR."Data fetched after \{time}");
        }
    }
}