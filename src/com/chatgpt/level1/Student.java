package com.chatgpt.level1;

public class Student {
    //Write a Java program to create a class called "Student" with instance variables
    // "name," "age," and "ID." Include a method to print the name and age of the student.

    String name;

    int age;

    int ID;

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public static void main(String[] args) {
        Student obj = new Student("Mahesh", 27, 273);
        obj.StudentInfo("Sandesh", 24);
        System.out.println("Student name is :" + obj.name + " and the age is: " + obj.age + " and the ID number is :" + obj.ID);
    }

    public void StudentInfo(String name, int age) {
        System.out.println("Student Name is : " + name + " and the age is : " + age);
    }
}
