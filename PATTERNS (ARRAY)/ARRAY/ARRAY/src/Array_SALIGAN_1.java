import java.util.Scanner;
public class Array_SALIGAN_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
   
        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();
        
        int [] array = new int[6];
        for (int i = 1; i < 6; i++) {
             System.out.print("Enter element (" + i + "): ");
             array[i] = sc.nextInt();  
        }         
       
        for (int i = 1; i < 6; i++) {
            
             
        }
        System.out.print("Data: " + array[1] + " , " + array[2] + " , " +  array[3] + " , " + array[4] + " , " + array[5] );
   
   
   
    
        
    }
}
