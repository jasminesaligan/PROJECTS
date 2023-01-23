import java.util.Scanner;
public class Array_SALIGAN_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
   
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Data: ");
        for (int i = 0; i < n; i++) {
             System.out.print( arr[i] + " ");
             
        }

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        
        System.out.println(" ");
        System.out.print("Reverse: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}    