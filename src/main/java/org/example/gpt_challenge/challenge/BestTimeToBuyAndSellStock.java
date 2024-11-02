package org.example.gpt_challenge.challenge;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int min = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - min);
            min = Math.min(min, price);
        }

        System.out.println(maxProfit);
    }
}
