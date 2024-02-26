package com.chatgpt.level1;

public class Phone {

    //Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage."
    // Include a method to calculate the price of the phone based on the
    // make, model, and storage capacity and a method to print the phone's make, model, and storage capacity.

    String make;

    int model;

    int storage;

    int price;

    public int calculatePrice(int storage)
    {
        if (storage <= 32) {
            price = 100;
        }
        else if (storage >= 32 || storage <= 64)
            {
                  price = 200;
            }
            else if (storage >= 64 || storage <= 128)
            {
                price = 300;
            }
        return price;
    }

    public void resultPhone(int price)
    {
        if (price < 50) {
            make = "jio";
            model = 23;
            System.out.println("Make is : " + make + " and model is: " + model);
        }
          else if (price >= 51 || price <= 100)
            {
                make = "karbon";
                model = 73;
                System.out.println("Make is : "+make+" and model is: "+model);
            }


    }

    public static void main(String[] args) {
    Phone obj = new Phone();
        System.out.println(obj.calculatePrice(32));
        obj.resultPhone(22);

    }




}
