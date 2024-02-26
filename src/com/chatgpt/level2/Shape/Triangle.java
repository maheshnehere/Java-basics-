package com.chatgpt.level2.Shape;

// Subclass representing a triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize the triangle with base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overridden method to calculate the area of the triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

