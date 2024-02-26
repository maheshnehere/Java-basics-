package com.chatgpt.level1;

public class Computer {
//    Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage."
//    Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity
//    and a method to print the computer's processor, RAM, and storage capacity.

   String processor;
   int ram,storage;

   double totalprice;

   public Computer(String processor,int ram,int storage)
   {
       this.processor = processor;
       this.ram = ram;
       this.storage = storage;
   }

   public double calculatePrice()
   {
      double processorprice = 0;
      double storageprice = 0;
      double ramprice = 0;

      if (processor.equals("AMD Ryzen 4 4400G"))
      {
          processorprice = 100;
      } else if (processor.equals("AMD Ryzen 5 5500G")) {
          processorprice = 150;
      } else if (processor.equals("AMD Ryzen 6 6600G")) {
          processorprice = 200;
      } else if (processor.equals("AMD Ryzen 7 7700G")) {
          processorprice = 250;
      }

      ramprice = ram *5;
      storageprice = storage *10;

       totalprice = processorprice+ramprice+storageprice;
      return totalprice;
   }

   public void printDetails()
   {
       System.out.println("Processor: "+processor);
       System.out.println("RAM: "+ram);
       System.out.println("Storage: "+storage+" GB");
   }

    public static void main(String[] args) {
        Computer comp1 = new Computer("AMD Ryzen 4 4400G",4,128);
        System.out.println("Computer Details");
        comp1.printDetails();
        System.out.println("Price: $"+ comp1.calculatePrice());
    }

}
