package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionProcessor {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(1, TransactionType.DEPOSIT, 1000.0, Status.SUCCESS),
                new Transaction(2, TransactionType.DEPOSIT, 2000.0, Status.FAILED),
                new Transaction(3, TransactionType.WITHDRAWAL, 500.0, Status.SUCCESS),
                new Transaction(4, TransactionType.WITHDRAWAL, 0.0, Status.SUCCESS),  // Invalid (amount is zero)
                new Transaction(5, TransactionType.TRANSFER, 1500.0, Status.SUCCESS),
                new Transaction(6, TransactionType.TRANSFER, 300.0, Status.FAILED),
                new Transaction(7, TransactionType.DEPOSIT, 500.0, Status.SUCCESS),
                new Transaction(8, TransactionType.TRANSFER, -250.0, Status.SUCCESS),  // Invalid (negative amount)
                new Transaction(9, TransactionType.WITHDRAWAL, 1000.0, Status.SUCCESS),
                new Transaction(10, TransactionType.DEPOSIT, 1500.0, Status.SUCCESS)
        );
        
        Map<Status, List<Transaction>> test = transactions.stream().filter(x -> x.getAmount() > 0)
                .collect(Collectors.groupingBy(Transaction::getStatus));
        test.forEach((key, value) -> test.put(key, value.stream().sorted((x1, x2) ->  Double.compare(x2.getAmount() , x1.getAmount())).toList()));
        Map<TransactionType, Double> totalAmount = test.entrySet().stream()
                .collect(Collectors.toMap(x -> x.getValue().getFirst().transactionType, y -> y.getValue().stream()
                        .mapToDouble(Transaction::getAmount).sum()));
        Map<TransactionType, List<Transaction>> topValues = test.entrySet().stream()
                .collect(Collectors.toMap(x -> x.getValue().getFirst().transactionType, y -> y.getValue()
                        .stream().limit(3).toList()));

        System.out.println(test);
        System.out.println(totalAmount);
        System.out.println(topValues);
    }
}

@AllArgsConstructor
@Getter
@ToString
class Transaction {
    int id;
    TransactionType transactionType;
    double amount;
    Status status;
}


enum TransactionType {
    DEPOSIT, WITHDRAWAL, TRANSFER
}

enum Status {
    SUCCESS, FAILED
}