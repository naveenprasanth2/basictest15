package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Customer {
    private String name;
    private List<Order> orders;
}
