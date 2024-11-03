package org.example.gpt_challenge.challenge1;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int low = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - low);
            low = Math.min(low, price);
        }

        System.out.println(maxProfit);
    }
}
