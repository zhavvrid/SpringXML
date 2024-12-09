package com.bsuir.spring.generator;

public class FibonacciCalculator implements FibonacciGenerator {

    @Override
    public long calculate(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be non-negative.");
        }
        if (index == 0) return 0;
        if (index == 1) return 1;

        long prev = 0, current = 1;
        for (int i = 2; i <= index; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
}
