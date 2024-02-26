package com.chatgpt.second;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121;

        int reverse = 0;

        int remainder,temp;

        temp = number;

        while(temp!=0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 +remainder;
            temp/=10;
        }
        if (number == reverse)
        {
            System.out.println(number+": is a palindrome number");
        }
        else
        {
            System.out.println(number+": is not a palindrome number");
        }
    }
}
