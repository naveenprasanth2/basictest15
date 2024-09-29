package org.example.gpt_challenges;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        String typeOfDay = switch (day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Please enter only days from week");
        };

        System.out.println(typeOfDay);

        int lengthOfDay = switch (day){
            case "MONDAY" -> {
                System.out.println("Calculating length for MONDAY");
                yield day.length();
            }
            case "TUESDAY" -> {
                System.out.println("Calculating length for TUESDAY");
                yield day.length();
            }
            default -> 0;
        };
    }
}
