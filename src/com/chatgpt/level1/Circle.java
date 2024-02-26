package com.chatgpt.level1;

public class Circle {
    // Write a Java program to create a class called "Circle" with an instance variable "radius."
    // Include a method to calculate the area of the circle
    // and a method to calculate the circumference of the circle.

        int radius;

        float pi = 3.14f;

        public float areaCircle(float radius)
        {

            return pi * (radius*radius);

        }

        public float circumferenceCircle(float radius)
        {

            return (float) (2 * 3.14 * radius);
        }

    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.areaCircle(4));
        System.out.println(obj.circumferenceCircle(4));
    }


}
