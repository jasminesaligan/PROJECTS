// Write a program that takes user input using Scanner class to 
// create an object of class 'Rectangle'. The Rectangle class should 
// have length and width as its attributes. The program should calculate 
// and print out the area and perimeter of the rectangle.

import java.util.Scanner;

public class co11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length of rectangle: ");
    double length = input.nextDouble();

    System.out.print("Enter width of rectangle: ");
    double width = input.nextDouble();

    Rectangle rectangle = new Rectangle(length, width);
    double area = rectangle.calculateArea();
    double perimeter = rectangle.calculatePerimeter();

    System.out.println("Area of rectangle: " + area);
    System.out.println("Perimeter of rectangle: " + perimeter);
  }
}

class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2 * (length + width);
  }
}
