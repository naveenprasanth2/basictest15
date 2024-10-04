package org.example.chatgpt.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    @JsonField(name = "name")
    private String name;
    @JsonField(name = "personAge")
    private int age;
    @JsonField
    private long phoneNumber;
    private String streetNumber;
}
