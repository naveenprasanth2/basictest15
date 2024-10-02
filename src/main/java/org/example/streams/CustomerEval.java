package org.example.streams;

import java.util.Comparator;
import java.util.List;

public class CustomerEval {
    public static void main(String[] args) {
        // Create orders for each customer
        List<Order> johnOrders = List.of(
                new Order(101, 300),
                new Order(102, 200),
                new Order(103, 500)
        );

        List<Order> annaOrders = List.of(
                new Order(104, 700),
                new Order(105, 150),
                new Order(106, 300)
        );

        List<Order> mikeOrders = List.of(
                new Order(107, 1200),
                new Order(108, 800),
                new Order(109, 450)
        );
        List<Order> aliceOrders = List.of(
                new Order(110, 100),
                new Order(111, 200)
        );


        // Create list of customers
        List<Customer> customers = List.of(
                new Customer("John", johnOrders),
                new Customer("Anna", annaOrders),
                new Customer("Mike", mikeOrders),
                new Customer("Alice", aliceOrders)
        );

       List<Order> finalList =  customers.stream().filter(x -> x.getOrders().stream().mapToDouble(Order::totalAmount).sum() > 500)
                .flatMap(x -> x.getOrders().stream())
                .sorted((x1, x2) -> (int) (x2.totalAmount() - x1.totalAmount()))
                .limit(3)
                .toList();
        System.out.println(finalList);
    }
}
