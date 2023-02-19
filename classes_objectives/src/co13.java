// Write a program that takes user input using Scanner class to create 
// an object of class 'Book'. The Book class should have title, author,
//  and ISBN as its attributes. The program should print out the details 
//  of the book.

import java.util.Scanner;

public class co13 {
    String title, author, isbn;
    
    public co13(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter title of the book: ");
        String title = sc.nextLine();
        
        System.out.print("Enter author of the book: ");
        String author = sc.nextLine();
        
        System.out.print("Enter ISBN of the book: ");
        String isbn = sc.nextLine();
        
        co13 book = new co13(title, author, isbn);
        book.printDetails();
        
        sc.close();
    }
}
