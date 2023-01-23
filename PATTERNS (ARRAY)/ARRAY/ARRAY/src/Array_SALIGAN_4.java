import java.util.Scanner;
public class Array_SALIGAN_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the size of storage: ");
        int n = sc.nextInt();
        
        float [] array = new float[n];
        for (int i = 0; i < n; i++) {
             System.out.print("Enter element " + (i+1) + ": ");
             array[i] = sc.nextFloat();  
        }         
        
        System.out.print("Data: ");
        for (int i = 0; i < n; i++) {
             System.out.print( + array[i] + " ");
             
        }
        
        float sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(" ");
        System.out.println("Total: " + sum);

        float average = sum/n;
        System.out.println("average: " + average);
        
























    }
}    