package org.example.oracle.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RateLimiter2 {

    private final int allowedCount;
    private final long thresholdTime;
    private int count;
    private long lastUpdated;

    public RateLimiter2(int allowedCount, long thresholdTime) {
        this.allowedCount = allowedCount;
        this.thresholdTime = thresholdTime;
        this.count = allowedCount;
        this.lastUpdated = System.currentTimeMillis();
    }


    private synchronized boolean checkAllowed() {
        resetCount();
        if (count > 0) {
            count--;
            return true;
        }
        return false;
    }

    private void resetCount() {
        long now = System.currentTimeMillis();
        long diff = now - lastUpdated; //2000
        int time = (int) (diff / thresholdTime); //10000
        int timeToAdd = count + time;
        if (timeToAdd > 0) {
            count = Math.min(allowedCount, timeToAdd);
            lastUpdated = now;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        RateLimiter2 rateLimiter2 = new RateLimiter2(5, 500);
        for (int i = 0; i < 100; i++) {
            System.out.println(rateLimiter2.checkAllowed());
            Thread.sleep(200);
        }
    }
}
