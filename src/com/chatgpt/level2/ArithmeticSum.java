package com.chatgpt.level2;
import java.util.Scanner;

public class ArithmeticSum {

    // Method to find the arithmetic sum of two variables
    public static int findSum(int a, int b) {
        return a + b;
    }

    // Method to find the arithmetic sum of three variables
    public static int findSum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to find the arithmetic sum of four variables
    public static int findSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for two variables
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate and print the sum of two variables
        int sum2 = findSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum2);

        // Get input for three variables
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Calculate and print the sum of three variables
        int sum3 = findSum(num1, num2, num3);
        System.out.println("Sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum3);

        // Get input for four variables
        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();

        // Calculate and print the sum of four variables
        int sum4 = findSum(num1, num2, num3, num4);
        System.out.println("Sum of " + num1 + ", " + num2 + ", " + num3 + ", and " + num4 + " is: " + sum4);
    }
}

