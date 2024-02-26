package com.chatgpt.second;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 3;

        int count = 0;



        if (number < 0)
        {
            System.out.println("Number is not a prime number");
            return;
        }

        for (int i = 1;i <= number / 2;i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }

        if (count > 1)
        {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("Prime number");
        }
    }
}
