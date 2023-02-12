// compute average 

import java.util.Scanner;
public class Method9 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    int [] values = new int [size];

    for (int i = 0; i < size; i++) {
        System.out.print("Enter value " + (i+1) + " : ");
        values[i] = sc.nextInt();
    }


    double average = getAverage(values);
    System.out.println("The average is: " + average);

    }

    public static double getAverage(int [] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values [i];
        }
        return (double) sum / values.length;
    }
   
    }

    // import java.util.Scanner;
    // public class Exercise2 {
    
    //  public static void main(String[] args)
    //     {
    //         Scanner in = new Scanner(System.in);
    //         System.out.print("Input the first number: ");
    //         double x = in.nextDouble();
    //         System.out.print("Input the second number: ");
    //         double y = in.nextDouble();
    //         System.out.print("Input the third number: ");
    //         double z = in.nextDouble();
    //         System.out.print("The average value is " + average(x, y, z)+"\n" );
    //     }
    
    //   public static double average(double x, double y, double z)
    //     {
    //         return (x + y + z) / 3;
    //     }
    // }
    