package org.example.gpt_challenge.challenge;

public enum WeekDay {
    JANUARY {
        @Override
        void value() {
            System.out.println("january");
        }
    }, FEBRUARY {
        @Override
        void value() {
            System.out.println("february");
        }
    };

    abstract void value();
}
