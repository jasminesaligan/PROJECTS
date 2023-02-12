// Write a value-returning method, isVowel that returns the value 
// true if a given character is a vowel, and otherwise returns false. 
// In main() method accept a string from user and count number of 
// vowels in that string.

import java.util.Scanner;
public class Method8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The integer is Prime");
        } else {
            System.out.println("The integer is not Prime");
        }

    
    }

    public static boolean isPrime( int num) {
        
        switch (num) {
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            
            return true;
        
            default:
                return false;
        }
    }
}
