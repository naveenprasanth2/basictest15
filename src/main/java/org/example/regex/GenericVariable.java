package org.example.regex;

import org.example.jpmc.Account;

import java.io.Serializable;
import java.util.List;

public class GenericVariable {
    public static void main(String[] args) {
        var name = "naveen";
        System.out.println(name.substring(3, 6));

        var account = new Account(1000);
        System.out.println(account.getBalance());

        List<? extends Serializable> test = List.of(1, "naveen", "test", 0.0);
        System.out.println(test.getFirst());
    }
}
