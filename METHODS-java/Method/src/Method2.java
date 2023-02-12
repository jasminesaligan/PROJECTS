import java.util.Scanner;
public class Method2 {
    

   public static void main(String[] args) {
        
    double i = 5.6;
    double j = 2.4;
    double k = max(5.6, 2.4);

    System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static double max (double num1, double num2) {
        double result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
