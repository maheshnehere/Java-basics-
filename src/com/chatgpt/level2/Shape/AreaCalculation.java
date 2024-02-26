package com.chatgpt.level2.Shape;


import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        // Get input for rectangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double rectBreadth = scanner.nextDouble();

        // Create an object of the Rectangle class
        Rectangle rectangle = new Rectangle(rectLength, rectBreadth);

        // Calculate and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Create an object of the Triangle class
        Triangle triangle = new Triangle(5.0, 8.0);

        // Calculate and print the area of the triangle
        System.out.println("Area of the triangle: " + triangle.calculateArea());
    }
}
