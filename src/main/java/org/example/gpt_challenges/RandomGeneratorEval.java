package org.example.gpt_challenges;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorEval {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGenerator.of(RandomGeneratorFactory.getDefault().name());
        System.out.println(randomGenerator.nextDouble());
        System.out.println(randomGenerator.nextFloat());
    }
}
