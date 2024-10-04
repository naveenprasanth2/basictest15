package org.example.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class EnumEval {
    public static void main(String[] args) {
        WeekDays weekDays = WeekDays.SUNDAY;
        System.out.println(weekDays.getTest());
        System.out.println(weekDays);
    }
}


@Getter
@AllArgsConstructor
enum WeekDays {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    private final String test;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}