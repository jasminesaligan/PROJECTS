import java.util.Scanner;
public class TRY {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    
        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();
            // for loop
        // int [] array = new int[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Enter element for index(" + i + "): ");
        //     array[i] = sc.nextInt();  
        // }         
        // System.out.println("Index\t==>\tElement");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(i + "\t==>\t" + array[i]);
                 
        // }
        

        // do while
        // int [] array1 = new int[n];
        // int i = 0;
        // do {
        //     System.out.print("Enter element for index(" + i + "): ");
        //     array1[i] = sc.nextInt();  
        //     i++;
        // } while (i < n);
        
        // System.out.println("Index\t==>\tElement");
        // int j = 0;
        // do {
        //     System.out.println(j + "\t==>\t" + array1[j]);
        //     j++;
        // } while (j < n);


        // while loop

        // int [] array1 = new int[n];
        // int i = 0;

        // while (i < n) {
        //     System.out.print("Enter element for index(" + i + "): ");
        //          array1[i] = sc.nextInt();  
        //          i++;
        // }
        // System.out.println("Index\t==>\tElement");
        // int j = 0;

        // while (j < n) {
        //     System.out.println(j + "\t==>\t" + array1[j]);
        //     j++;
        // }

        System.out.print("Enter the size of the array: ");
        int size3 = sc.nextInt();
        int[] arr4 = new int[size3];
   
        for(int i = 0; i < size3; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr4[i] = sc.nextInt();
        }
   
        for (int i = 0; i < size3/2; i++) {
            int temp = arr4[i];
            arr4[i] = arr4[size3-1-i];
            arr4[size3-1-i] = temp;
        }
   
        System.out.print("Reversed Array: ");
        for (int i = 0; i < size3; i++) {
            System.out.print(arr4[i] + " ");
        }

       
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
