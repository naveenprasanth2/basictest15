package org.example.chatgpt.threads;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.CyclicBarrier;

public class RelayRace {

    public static void main(String[] args) {

    }


    @AllArgsConstructor
    static class Racer implements Runnable {
        private final CyclicBarrier cyclicBarrier;
        private final int runnerNumber;

        @Override
        public void run() {

        }
    }
}
