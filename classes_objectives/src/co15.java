// Write a program that takes user input using Scanner 
// class to create an object of class 'Circle'. The Circle 
// class should have radius as its attribute. The program 
// should calculate and print out the area and circumference of the circle.

import java.util.Scanner;

public class co15 {
    private double radius;

    public co15(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        co15 circle = new co15(radius);

        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }
}
