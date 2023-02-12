// Write a program with a method named getTotal that accepts two 
// integers as an argument and return its sum. Call this method from main( )
// and print the results.

import java.util.Scanner;
public class Method5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

     
        System.out.print("Enter first value: ");
        double x = sc.nextDouble();

        System.out.print("Enter second value: ");
        double y = sc.nextDouble();

        double z = zValue (x, y);

        System.out.println("The sum is: " + z);
    }

    public static double zValue (double x, double y) {
      
        return x + y;
    }

      
}
