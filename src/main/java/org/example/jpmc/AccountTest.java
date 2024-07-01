package org.example.jpmc;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account(10000);

        account2.transferMoney(account1, 500);


        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
