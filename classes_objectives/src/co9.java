// Write a program that takes user input using Scanner 
// class to create a new object of class 'Person'. 
// The Person class should have name, age, and gender as its attributes. 
// The program should print out the details of the person.

import java.util.Scanner;

public class co9 {
    private String name;
    private int age;
    private String gender;
    
    public co9(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        
        co9 person = new co9(name, age, gender);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
