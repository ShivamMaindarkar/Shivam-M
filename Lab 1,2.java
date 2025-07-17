//lab1- Assignment-1
//Employee
public class Employee {

    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.age = (int)35.5;

        System.out.println("Successfully started");
    }
}

//lab1-Assignment-2
//Student
public class Student {

    private String studentName;
    private String collegeName;
    private int studentID;
    public static void main(String[] args) {
        System.out.println("Successful");
    }
}

//lab1-Assignment-3
//package Person
package com.anudip.learning;

public class Person {
     String name = "John Doe";
    int age = 30;
    int salary = 50000;

    public static void main(String[] args) {
        System.out.println("Test Successful");
    }

}

//Lab 2- Assignment 1
//Car
import java.util.Scanner;

public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void display() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cars do you want to create? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            short year = scanner.nextShort();

            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); 

            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\n--- Car Information ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars[i].display();
            System.out.println();
        }

        scanner.close();
    }
}

//Lab2-Assignment-2
//Calculator
import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of two integers: " + calc.add(x, y));

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three integers: " + calc.add(a, b, c));

        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        sc.close();
    }
}