// Write a program that takes user input using Scanner class
// to create an array of objects of class 'Employee'. The Employee 
// class should have name, designation, and salary as its attributes. 
// The program should calculate and print out the total salary of all the employees.

import java.util.Scanner;

class Employee {
    String name;
    String designation;
    double salary;
    
    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
}

public class co14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of employee " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Designation: ");
            String designation = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            employees[i] = new Employee(name, designation, salary);
        }

        double totalSalary = 0;
        for (int i = 0; i < n; i++) {
            totalSalary += employees[i].getSalary();
        }

        System.out.println("Total salary of all employees: " + totalSalary);
    }
}
