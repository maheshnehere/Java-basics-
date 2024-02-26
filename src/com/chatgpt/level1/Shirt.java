package com.chatgpt.level1;

public class Shirt {
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateSizeDiscount() {
        double discount = 0.0;
        // Apply discount based on size
        switch (size.toUpperCase()) {
            case "SMALL":
                discount = 0.1; // 10% discount for small size
                break;
            case "MEDIUM":
                discount = 0.05; // 5% discount for medium size
                break;
            // Add more cases for other sizes if needed
            default:
                discount = 0.0; // No discount for other sizes
                break;
        }
        return discount * price;
    }

    public void printDetails() {
        double sizeDiscount = calculateSizeDiscount();
        double discountedPrice = price - sizeDiscount;
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("Small", "Blue", 25.0);
        shirt1.printDetails();

        Shirt shirt2 = new Shirt("Medium", "Red", 30.0);
        shirt2.printDetails();
    }
}

