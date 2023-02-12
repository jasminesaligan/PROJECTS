// Write a method named isEven that accepts an int argument. 
// The method should return true if the argument is even, or false otherwise. 
// Also write a program to test your method.

import java.util.Scanner;
public class Method6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Value is Even");
        } else {
            System.out.println("Value is Odd");
        }

    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
