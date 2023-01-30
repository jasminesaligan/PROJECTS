import java.util.Scanner;
public class TwoDArray_SALIGAN_1 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    
    
  
    System.out.println("Enter size of the array: ");
    System.out.print("Enter rows: ");
    int rows = sc.nextInt();
        
    System.out.print("Enter columns: ");
    int columns = sc.nextInt();

    int array [][] = new int[rows][columns];

    System.out.println("Enter" + " " + (rows * columns) + " " + "element: ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print("Enter element for row [" + (i+1) + "] column ["+ (j+1) + "]: ");
            array[i][j] = sc.nextInt();
        }    
    }
    sc.close();

    System.out.println("The array is : ");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(array [i][j] + " ");
        }
        System.out.println();
    }
    
    }
}