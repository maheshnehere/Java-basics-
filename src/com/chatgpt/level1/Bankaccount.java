package com.chatgpt.level1;

public class Bankaccount {
    //Write a Java program to create a class called "BankAccount"
    // with instance variables "balance" and "accountNumber.
    // " Include a method to deposit money into the account and a method to withdraw money from the account.

 static long ACCOUNTNUMBER = 234455667765L;

 double balance;



 double beforedepositBalance = 500d;

 double afterdepositbalance;

 public double depositMoney(double deposit)
 {
     balance = beforedepositBalance+deposit;
     afterdepositbalance = balance;
     return afterdepositbalance;

 }

 public double withdrawMoney(double withdraw)
 {
     balance = afterdepositbalance-withdraw;

     return balance;
 }

    public static void main(String[] args) {

     Bankaccount obj = new Bankaccount();
     obj.depositMoney(500.00);

     obj.withdrawMoney(200.00);
        System.out.println("Money deposited is :"+obj.depositMoney(500.00)+"and the Account number is :"+ACCOUNTNUMBER);
        System.out.println("Money withdrawn is :"+obj.withdrawMoney(200.00)+"and the Account number is :"+ACCOUNTNUMBER);


    }



}
