package com.chatgpt.level2;

import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate area of square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double squareArea = calculateArea(side);
        System.out.println("Area of the square: " + squareArea);

        // Calculate area of rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = calculateArea(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate area of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculateArea(radius);
        System.out.println("Area of the circle: " + circleArea);
    }
}
