package org.example.jpmc;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Account {
    private final UUID accountNumber;
    private double balance;

    public Account(double balance) {
        accountNumber = UUID.randomUUID();
        this.balance = balance;
    }

    public void depositMoney(double depositValue) {
        setBalance(getBalance() + depositValue);
    }

    public void withdrawMoney(double withdrawAmount) {
        if (getBalance() < withdrawAmount) {
            throw new InsufficientBalanceException("Your withdrawal amount is higher than current balance");
        } else {
            setBalance(getBalance() - withdrawAmount);
        }
    }

    public void transferMoney(Account account, double amount) {
        if (getBalance() < amount) {
            throw new InsufficientBalanceException("Your withdrawal amount is higher than current balance");
        } else {
            setBalance(getBalance() - amount);
            account.depositMoney(amount);
        }
    }

    public double getCurrentBalance() {
        return getBalance();
    }

}
