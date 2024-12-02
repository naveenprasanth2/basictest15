package org.example.codedecode.challenges;

public class SecondSmallestTry {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : array){
            if (number <= smallest){
                secondSmallest = smallest;
                smallest = number;
            }else if(number <= secondSmallest){
                secondSmallest = number;
            }
        }

        System.out.println(secondSmallest);
        System.out.println(smallest);
    }
}
