package com.bsuir.spring.service;
import com.bsuir.spring.generator.FibonacciGenerator;

import java.util.Scanner;

public class Service {

    private FibonacciGenerator calculator;

    public Service() {
    }

    public Service(FibonacciGenerator calculator) {
        this.calculator = calculator;
    }

    public void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index for Fibonacci number: ");
        int index = scanner.nextInt();
        System.out.println("Fibonacci number at index " + index + ": " + calculator.calculate(index));
    }

    public void setCalculator(FibonacciGenerator calculator) {
        this.calculator = calculator;
    }
}
