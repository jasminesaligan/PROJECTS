import java.util.Scanner;
public class ARRAY {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    


        // // Declaration
        // // 1. With Initialized vlue
        // int arr[] = {100, 70, 60, 85, 90};

        // // 2. With Initialized size
        // int [] arr1 = new int[10];

        // // 3. Just Declaration.
        // int[] arr2;

        // // call out  0   1    2   3  4   5  6  7  8  9
        // int num[] = {10, 20, 40, 50, 60, 2, 8, 6, 5, 9};
        // System.out.println(num [7]);

        // //Assign a value
        // num[0] = 800;
        // System.out.println(num [0]);

        // int [] number = new int[5];
        // System.out.println("Enter a number: ");
        // number [1] = sc.nextInt();

        // number [0] = 10;
    
        // number [2] = 70;
        // number [3] = 80;
        // number [4] = 550;

        // System.out.println(number [0] + " , " + number [1] + " , " + number [2] + " , " + number [3] + " , " + number [4] );



       // ==========================================================================================
       
     System.out.print("Enter the size of array: ");
     int n = sc.nextInt();
     
     int [] array = new int[n];
     for (int i = 0; i < n; i++) {
          System.out.print("Enter element for index(" + i + "): ");
          array[i] = sc.nextInt();  
     }         
     System.out.println("Index\t==>\tElement");
     for (int i = 0; i < n; i++) {
          System.out.println(i + "\t==>\t" + array[i]);
          
     }
  
   
     // sum of array ------------------------------------------------

     System.out.print("Enter the size of the array: ");
     int size = sc.nextInt();
     int[] arr = new int[size];
    
     for(int i = 0; i < size; i++) {
          System.out.print("Enter element " + (i+1) + ": ");
          arr[i] = sc.nextInt();
    }

     int sum = 0;
     for(int i = 0; i < size; i++) {
          sum += arr[i];
    }

    System.out.println("Sum of the array: " + sum);

    // sort numeric array -------------------------------------------

    System.out.print("Enter the size of the array: ");
    int size1 = sc.nextInt();
    int[] arr1 = new int[size];
     
     for(int i = 0; i < size1; i++) {
          System.out.print("Enter element " + (i+1) + ": ");
          arr1[i] = sc.nextInt();
     }
     for (int i = 0; i < size - 1; i++) {
          for (int j = 0; j < size - i - 1; j++) {
              if (arr[j] > arr1[j + 1]) {
                  int temp = arr1[j];
                  arr1[j] = arr1[j + 1];
                  arr1[j + 1] = temp;
              }
          }
      }
  
     System.out.print("Sorted Array: ");
     for (int i = 0; i < size; i++) {
          System.out.print(arr1[i] + " ");
      }

    
    // average of the value of an array ------------------------------

    System.out.print("Enter the size of the array: ");
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
   
    for(int i = 0; i < size2; i++) {
         System.out.print("Enter element " + (i+1) + ": ");
         arr2[i] = sc.nextInt();
     }

     int sum1 = 0;
     for(int i = 0; i < size2; i++) {
         sum1 = sum1 + arr2[i];
     }
     int average = sum1/size2;
         System.out.println("average: " + average);
     
     // minumum and maximum -----------------------------

     System.out.print("Enter the size of the array: ");
     int size2 = sc.nextInt();
     int[] arr3 = new int[size2];

     for(int i = 0; i < size2; i++) {
         System.out.print("Enter element " + (i+1) + ": ");
         arr3[i] = sc.nextInt();
     }

     int min = arr3[0];
     int max = arr3[0];
     for(int i = 1; i < size2; i++) {
         if(arr3[i] < min) {
             min = arr3[i];
         }
         if(arr3[i] > max) {
             max = arr3[i];
         }
     }

     System.out.println("Minimum value: " + min);
     System.out.println("Maximum value: " + max);

     //reverse ---------------------------------------------------------

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
    
     // second largest -------------------------------------------------

     System.out.print("Enter the size of the array: ");
          int size5 = sc.nextInt();
          int[] arr6 = new int[size5];

          for(int i = 0; i < size5; i++) {
               System.out.print("Enter element " + (i+1) + ": ");
               arr6[i] = sc.nextInt();
          }

          int firstLargest = arr6[0];
          int secondLargest = Integer.MIN_VALUE;
          for(int i = 1; i < size5; i++) {
               if(arr6[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr6[i];
               }
               else if(arr6[i] > secondLargest && arr6[i] != firstLargest) {
                secondLargest = arr6[i];
               }
          }
     System.out.println("Second largest value: " + secondLargest);

     // second smallest ----------------------------------------------------

     System.out.print("Enter the size of the array: ");
     int size6 = sc.nextInt();
     int[] arr7 = new int[size6];

     for(int i = 0; i < size6; i++) {
          System.out.print("Enter element " + (i+1) + ": ");
          arr7[i] = sc.nextInt();
     }

          int firstSmallest = arr7[0];
          int secondSmallet = Integer.MAX_VALUE;
          for(int i = 1; i < size6; i++) {
               if(arr7[i] < firstSmallest) {
                secondSmallet = firstSmallest;
                firstSmallest = arr7[i];
               }
               else if(arr7[i] < secondSmallet && arr7[i] != firstSmallest) {
                secondSmallet = arr7[i];
               }
          }
     System.out.println("Second smallet value: " + secondSmallet);

     // largest value ------------------------------------------------------

     System.out.print("Enter the size of the array: ");
     int size7 = sc.nextInt();
     int[] arr8 = new int[size7];

     for(int i = 0; i < size7; i++) {
          System.out.print("Enter element " + (i+1) + ": ");
          arr8[i] = sc.nextInt();
     }

          int Largest = arr8 [0];
          for (int i = 1; i < size7; i++) {
               if (arr8 [i] > Largest) {
               Largest = arr8 [i];
               }
          }
           System.out.println("Largest: " + Largest);

     // smallest value ----------------------------------------------------

     System.out.print("Enter the size of the array: ");
     int size8 = sc.nextInt();
     int[] arr9 = new int[size8];

     for(int i = 0; i < size8; i++) {
          System.out.print("Enter element " + (i+1) + ": ");
          arr9[i] = sc.nextInt();
     }

          int Smallest = arr9 [0];
          for (int i = 1; i < size8; i++) {
               if (arr9 [i] < Smallest) {
               Smallest = arr9 [i];
               }
          }
           System.out.println("Largest: " + Smallest);

    
    
    
    
    
    
    
    
    
    
    
    
    
     }
}
