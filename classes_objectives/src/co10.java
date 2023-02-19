// Write a program that takes user input using Scanner class to 
// create an array of objects of class 'Student'. The Student class 
// should have name, roll number, and marks in 3 subjects as its attributes. 
// The program should calculate the total marks and average marks for each 
// student and print them out.


import java.util.Scanner;

public class co10 {
    private String name;
    private int rollNumber;
    private int[] marks;
    
    public co10(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    
    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        
        co10[] students = new co10[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();
            
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j+1) + ": ");
                marks[j] = scanner.nextInt();
                scanner.nextLine();
            }
            
            students[i] = new co10(name, rollNumber, marks);
            System.out.println();
        }
        
        for (co10 student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll number: " + student.getRollNumber());
            System.out.println("Total marks: " + student.getTotalMarks());
            System.out.println("Average marks: " + student.getAverageMarks());
            System.out.println();
        }
    }
}
