package com.chatgpt.level2.Shape;

// Subclass representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Constructor to initialize the rectangle with length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overridden method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
