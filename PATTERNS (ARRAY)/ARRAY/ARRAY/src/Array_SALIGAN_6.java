import java.util.Scanner;
public class Array_SALIGAN_6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    
        System.out.print("Enter the size of storage: ");
        int n = sc.nextInt();
        
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
             System.out.print("Enter element " + (i+1) + ": ");
             array[i] = sc.nextInt();  
        }         
        
        System.out.print("Data: ");
        for (int i = 0; i < n; i++) {
             System.out.print( + array[i] + " ");
             
        }
     
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    
        System.out.println(" ");
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}    