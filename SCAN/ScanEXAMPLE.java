// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int multiply = multiply();
        System.out.println("The multiply is: " + multiply);

        // Method call
        int divide = divide();
        System.out.println("The difference is: " + divide);

        int subtract = subtract();
        System.out.println("The minued is: " + subtract);
        
        int add = sum();
        System.out.println("The sum is: " + add);

        // close scanner
        scan.close();
    }

    // This method will request for two numbers and will add them.
    static int multiply() {
        System.out.println("This method will multiply two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x * y;
    }

    // This method will request for two numbers and will subtract them.
    static int divide() {
        System.out.println("This method will divide two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x / y;
    }
    // This method will request for two numbers and will subtract them.
    static int subtract() {
        System.out.println("This method will subtract two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x - y;
    }
    // This method will request for two numbers and will subtract them.
    static int sum() {
        System.out.println("This method will add two numbers from user input");
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        return x + y;
    }
} 
