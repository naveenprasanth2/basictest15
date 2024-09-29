package org.example.gpt_challenges;

import lombok.AllArgsConstructor;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random(100, 200);
        System.out.println(random.getRandom());
    }

}

record Random(int from, int to) {
    long getRandom() {
        long seedTime = System.currentTimeMillis();
        int range = to - from;
        return (from + (seedTime % range));
    }
}
