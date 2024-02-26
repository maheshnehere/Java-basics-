package com.chatgpt.level1;
    //  Write a Java program to create a class called "Furniture" with instance variables "type," "material," and "price."
    //  Include a method to calculate the discount on the furniture based on its material
    //  and a method to print the furniture's type, material, and discounted price .

    public class Furniture {
        private String type;
        private String material;
        private double price;

        public Furniture(String type, String material, double price) {
            this.type = type;
            this.material = material;
            this.price = price;
        }

        public double calculateDiscount() {
            double discount = 0.0;
            // Apply discount based on material
            switch (material.toLowerCase()) {
                case "wood":
                    discount = 0.1; // 10% discount for wood
                    break;
                case "plastic":
                    discount = 0.05; // 5% discount for plastic
                    break;
                // Add more cases for other materials if needed
                default:
                    discount = 0.0; // No discount for other materials
                    break;
            }
            return discount * price;
        }

        public void printDetails() {
            double discountedPrice = price - calculateDiscount();
            System.out.println("Type: " + type);
            System.out.println("Material: " + material);
            System.out.println("Discounted Price: $" + discountedPrice);
        }

        public static void main(String[] args) {
            Furniture chair = new Furniture("Chair", "Wood", 100.0);
            chair.printDetails();

            Furniture table = new Furniture("Table", "Plastic", 200.0);
            table.printDetails();
        }
    }

    //https://www.accenture.com/in-en/careers/jobdetails?id=AIOC-S01504447_en&title=Customer%20Contact%20Communications%20Analyst







