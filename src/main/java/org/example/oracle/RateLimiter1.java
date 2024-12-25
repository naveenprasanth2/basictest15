package org.example.oracle;

public class RateLimiter1 {
    private final int maxTokens;
    private final long refillTime;
    private int currentTokens;
    private long lastRefill;

    public RateLimiter1(int maxTokens, long refillTime) {
        this.maxTokens = maxTokens;
        this.refillTime = refillTime;
        this.currentTokens = maxTokens;
        this.lastRefill = System.currentTimeMillis();
    }

    private synchronized boolean checkAllowed() {
        resetTokens();
        if (currentTokens > 0) {
            currentTokens--;
            return true;
        }
        return false;
    }

    private void resetTokens() {
        long now = System.currentTimeMillis();
        long difference = now - lastRefill;

        int tokensToAdd = (int) (difference / refillTime);
        if (tokensToAdd > 0) {
            currentTokens = Math.min(maxTokens, currentTokens + tokensToAdd);
            lastRefill = now;
        }
    }

    public static void main() throws InterruptedException {
        RateLimiter1 rateLimiter = new RateLimiter1(5, 500);
        for (int i = 0; i < 100; i++) {
            System.out.println(rateLimiter.checkAllowed());
            Thread.sleep(200);
        }
    }
}
