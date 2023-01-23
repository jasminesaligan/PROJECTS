import java.util.Scanner;
public class Array_SALIGAN_5 {
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
    int min = array[0];
    int max = array[0];
    for(int i = 1; i < n; i++) {
        if(array[i] < min) {
            min = array[i];
        }
        if(array[i] > max) {
            max = array[i];
        }
    }
    System.out.println(" ");
    System.out.println("Minimum value: " + min);
    System.out.println("Maximum value: " + max);
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}    