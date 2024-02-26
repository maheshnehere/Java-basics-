package com.chatgpt.level1;

import java.util.Scanner;

public class Tv {
    //Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price."
    // Include a method to calculate the discount on the TV based on its size and a method to print the TV's brand,
    // size, and discounted price.

int size;

String Brand;

double price;

public int tvSize(int price)
{
    if (size <= 20)
    {
        return 100;
    } else if (size >=21 || size <= 30)
    {
        return 200;
    } else if (size >=31 || size <=40)
    {
      return 400;
    } else if (size >= 41 || size <=50)
    {
        return 500;
    }

    return price;
}

public int infoTv(int discount)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter discount percentage (%) :");
    discount = sc.nextInt();

    if (discount <=10 ) {
        Brand = "ONIDA";
        size = 10;
        System.out.println("Brand name is : " + Brand + " Size will be: " + size + " and discount amount is :" + discount);
    } else if (discount >= 11 || discount <= 20) {
            Brand = "AIWA";
            size = 15;
            System.out.println(" Brand name is : " + Brand + " Size will be: " + size + " and discount amount is :" + discount);
        } else if (discount >= 21 || discount <= 25) {
            Brand = "HITEK";
            size = 22;
            System.out.println("Brand name is : " + Brand + " Size will be: " + size + " and discount amount is :" + discount);
        } else if (discount >= 25 || discount <= 30) {
            Brand = "MICROMAX";
            size = 27;
            System.out.println("Brand name is : " + Brand + " Size will be: " + size + " and discount amount is :" + discount);
        } else if (discount >= 31 || discount <= 40) {
            Brand = "LG";
            size = 35;
            System.out.println("Brand name is : " + Brand + "Size will be: " + size + "and discount amount is :" + discount);
        } else if (discount >= 41 || discount <= 50) {
            Brand = "SONY";
            size = 49;
            System.out.println("Brand name is : " + Brand + " Size will be: " + size + " and discount amount is :" + discount);
        sc.close();
        }

    return discount;

}

    public static void main(String[] args) {
        Tv obj = new Tv();
        obj.infoTv(15);

    }





}
