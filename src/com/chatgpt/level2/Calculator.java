package com.chatgpt.level2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Get input from the user
        double num1 = calculator.input("Enter the first number: ");
        double num2 = calculator.input("Enter the second number: ");

        // Perform addition and print the result
        double result = calculator.add(num1, num2);
        System.out.println("The sum is: " + result);
    }

    // Method to get input from the user
    public double input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Method to perform addition and return the result
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

