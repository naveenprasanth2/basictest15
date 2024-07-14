package org.example.gpt_challenge;

import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salaries = {4000, 3000, 1000, 2000};
        double averageSalary = calculateAverageSalary(salaries);
        System.out.println(averageSalary); // Output should be 2500.0
    }

    private static double calculateAverageSalary(int[] salaries) {
        double minSalary = Arrays.stream(salaries).min().orElseThrow(ArrayIndexOutOfBoundsException::new);

        double maxSalary = Arrays.stream(salaries).max().orElseThrow(ArrayIndexOutOfBoundsException::new);

        double average = Arrays.stream(salaries)
                .filter(x -> x != minSalary && x != maxSalary)
                .mapToDouble(x -> x)
                .sum();

        return average / (salaries.length - 2);
    }


}
