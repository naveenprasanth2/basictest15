package org.example.chatgpt.threading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantEval {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        BankAccount bankAccount = new BankAccount(1000, reentrantLock);
        Thread t1 = new Thread(() -> bankAccount.deposit(500));
        Thread t2 = new Thread(() -> bankAccount.withdraw(300));
        Thread t3 = new Thread(() -> bankAccount.deposit(700));
        Thread t4 = new Thread(() -> bankAccount.withdraw(200));
        List<Thread> threads = List.of(t1, t2, t3, t4);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        threads.forEach(executorService::execute);
        executorService.shutdown();
        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount {
    @Getter
    private double balance = 0.0;
    private final ReentrantLock reentrantLock;

    BankAccount(double balance, ReentrantLock reentrantLock) {
        this.balance = balance;
        this.reentrantLock = reentrantLock;
    }

    public void deposit(double amount) {
        reentrantLock.lock();
        balance += amount;
        reentrantLock.unlock();
    }

    public void withdraw(double amount) {
        reentrantLock.lock();
        balance -= amount;
        reentrantLock.unlock();
    }
}