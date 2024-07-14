package org.example.gpt_challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyEval {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(Currency.USD, 1500.0),
                new Transaction(Currency.EUR, 2300.0),
                new Transaction(Currency.USD, 9900.0),
                new Transaction(Currency.EUR, 1200.0),
                new Transaction(Currency.JPY, 4500.0),
                new Transaction(Currency.USD, 7600.0),
                new Transaction(Currency.GBP, 6400.0)
        );

       List<Map.Entry<Currency, List<Transaction>>> test =transactions.stream().collect(Collectors.groupingBy(Transaction::currency))
                .entrySet().stream().toList();

        System.out.println(test);
    }
}
