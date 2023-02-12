// Write a value-returning method, isVowel that returns the value 
// true if a given character is a vowel, and otherwise returns false. 
// In main() method accept a string from user and count number of 
// vowels in that string.

import java.util.Scanner;
public class Method7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);

        if (isVowel(letter)) {
            System.out.println("The letter is Vowel");
        } else {
            System.out.println("The letter is Consonant");
        }

    
    }

    public static boolean isVowel( char letter) {
        
        switch (letter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
            
            return true;
        
            default:
                return false;
        }
    }
}
