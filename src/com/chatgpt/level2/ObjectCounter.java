package com.chatgpt.level2;

public class ObjectCounter {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Constructor increments the objectCount each time an object is created
    public ObjectCounter() {
        objectCount++;
    }

    // Method to get the current count of objects
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects of the ObjectCounter class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Getting and printing the count of objects
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}

