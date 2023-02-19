// Write a program that takes user input using Scanner class
//  to create an array of objects of class 'Product'. 
//  The Product class should have name, price, and quantity 
//  as its attributes. The program should calculate and print 
//  out the total price of all the products.

import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class co16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(name, price, quantity);
        }

        double totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }

        System.out.println("Total price of all products: " + totalPrice);
    }
}
