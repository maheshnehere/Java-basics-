package com.chatgpt.level2;
import java.util.Scanner;

public class SumOfBytes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for two byte values
        System.out.print("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();

        System.out.print("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        // Perform type casting to convert bytes to integers and calculate the sum
        int sum = (int) byte1 + (int) byte2;

        // Print the result
        System.out.println("Sum of " + byte1 + " and " + byte2 + " is: " + sum);
    }
}

