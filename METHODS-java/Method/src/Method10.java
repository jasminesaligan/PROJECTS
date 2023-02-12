// minimum
import java.util.Scanner;

public class Method10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] numbers = new int[size];
    
    System.out.println("Enter the values of the array: ");
    for (int i = 0; i < size; i++) {
      numbers[i] = scanner.nextInt();
    }
    
    int min = getMin(numbers);
    System.out.println("The minimum value of the array is: " + min);
  }
  
  public static int getMin(int[] array) {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }
}

// import java.util.Scanner;
// public class Exercise1 {

//  public static void main(String[] args)
//     {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input the first number: ");
//         double x = in.nextDouble();
//         System.out.print("Input the Second number: ");
//         double y = in.nextDouble();
//         System.out.print("Input the third number: ");
//         double z = in.nextDouble();
//         System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
//     }

//    public static double smallest(double x, double y, double z)
//     {
//         return Math.min(Math.min(x, y), z);
//     }
// }

