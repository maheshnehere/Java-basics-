package com.chatgpt.level1;

public class Employee {
    //Write a Java program to create a class called "Employee" with instance variables
    // "name," "salary," and "ID." Include a method to calculate the employee's yearly salary
    // and a method to print the employee's name and salary.

    static String name;
    static double salary;
    static int ID;
    double annualincome;
    static double empSalary;


    //TODO:fix static error.
    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void empInfo(String empName) {
        this.name = empName;

        double dailywage = 250;
        int daysinmonths = 30;

        empSalary = dailywage * daysinmonths;

        System.out.println("Employee name is : " + empName + " and the monthly salary is : " + empSalary);
    }

    public void annualSalary() {
        annualincome = salary * 365;
        System.out.println("Annual income is :" + annualincome);
    }


    public static void main(String[] args) {
        Employee obj = new Employee("Mahesh", 250.00, 45667);
        obj.empInfo("Sandesh");
        obj.annualSalary();

    }

}
