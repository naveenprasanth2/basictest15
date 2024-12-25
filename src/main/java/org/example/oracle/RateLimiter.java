package org.example.oracle;

public class RateLimiter {
    private final int maxTokens;
    private final long refillTimeInterval;
    private int currentTokens;
    private long lastRefill;

    public RateLimiter(int maxTokens, long refillTimeInterval) {
        this.maxTokens = maxTokens;
        this.refillTimeInterval = refillTimeInterval;
        this.currentTokens = maxTokens;
        this.lastRefill = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {
        refillTokens();
        if (currentTokens > 0){
            currentTokens--;
            return true;
        }
        return false;
    }

    private void refillTokens() {
        long now = System.currentTimeMillis();
        long timeSinceLastRefill = now - lastRefill;

        // Calculate how many tokens to add based on time elapsed
        int tokensToAdd = (int) (timeSinceLastRefill / refillTimeInterval);
        if (tokensToAdd > 0) {
            currentTokens = Math.min(maxTokens, currentTokens + tokensToAdd);
            lastRefill = now; // Update the last refill time
        }
    }

    public static void main() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(5, 500);
        for (int i = 0; i < 100; i++){
            System.out.println(rateLimiter.allowRequest());
            Thread.sleep(200);
        }
    }

}
