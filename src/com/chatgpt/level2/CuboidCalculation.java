package com.chatgpt.level2;

import java.util.Scanner;

public class CuboidCalculation {

    // Method to calculate the volume of the cuboid
    public static double calculateVolume(double length, double breadth, double height) {
        double volume = length * breadth * height;
        System.out.println("Volume of the cuboid: " + volume);

        // Call the area method
        double area = calculateArea(length);
        return volume;
    }

    // Method to calculate the surface area of the cuboid
    public static double calculateArea(double length) {
        double surfaceArea = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("Surface Area of the cuboid: " + surfaceArea);

        // Call the perimeter method
        double perimeter = calculatePerimeter(length, breadth, height);
        return surfaceArea;
    }

    // Method to calculate the perimeter of the cuboid
    public static double calculatePerimeter(double length, double breadth, double height) {
        double perimeter = 4 * (length + breadth + height);
        System.out.println("Perimeter of the cuboid: " + perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for length, breadth, and height
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        // Call the volume method
        double volume = calculateVolume(length, breadth, height);
    }
}
