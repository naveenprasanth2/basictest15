package org.example.regex;

import java.util.concurrent.CompletableFuture;

public class MultiThreadingComp {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "test");
        completableFuture.thenAccept(System.out::println);
    }
}
