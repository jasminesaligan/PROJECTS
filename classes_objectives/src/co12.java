// Write a program that takes user input using Scanner 
// class to create an array of objects of class 'Car'. 
// The Car class should have make, model, and year as its attributes. 
// The program should print out the details of all the cars.

import java.util.Scanner;

class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class co12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int numCars = scanner.nextInt();

        Car[] cars = new Car[numCars];

        for (int i = 0; i < numCars; i++) {
            System.out.println("Enter the details of car " + (i+1) + ":");
            System.out.print("Make: ");
            String make = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            cars[i] = new Car(make, model, year);
        }

        System.out.println("\nDetails of all cars:");
        for (int i = 0; i < numCars; i++) {
            cars[i].printDetails();
            System.out.println();
        }
    }
}
