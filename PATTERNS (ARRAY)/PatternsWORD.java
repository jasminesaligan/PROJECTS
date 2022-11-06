public class PatternsWORD {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};

        //outer loop - row
        for (int row = 0; row < 4; row++) {
            // line break         
            System.out.println(" ");
            // inner loop - column
            for (int column = 0; column < 4; column++) {
                System.out.print(mdArray[row][column] + " ");
            }
        }
    
  
      //   // WORD 1 PREY
        System.out.println("1. WORD 1");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
           // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 0) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
      
        
      // WORD 2 LAVA
        System.out.println("");
        System.out.println("2. WORD 2");

          //outer loop - row
          for (int row = 0; row < 4; row++) {
            // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 1) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
      
        
      // WORD 3 OVER
        System.out.println("");
        System.out.println("3. WORD 3");

          //outer loop - row
          for (int row = 0; row < 4; row++) {
           // line break 
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 2) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
        
      // WORD 4 TEND
        System.out.println("");
        System.out.println("4. WORD 4");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
           // line break 
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 3) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
        
      // WORD 5 PLOT
        System.out.println("");
        System.out.println("5. WORD 5");

          //outer loop - row
          for (int row = 0; row < 4; row++) {
            // line break 
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (column == 0) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }


      
       // WORD 6 RAVE
        System.out.println("");
        System.out.println("6. WORD 6");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
           // line break 
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (column == 1) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
        
       // WORD 7 EVEN
        System.out.println("");
        System.out.println("7. WORD 7");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
            // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (column == 2) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }
        
          // WORD 8 YARD
        System.out.println("");
        System.out.println("8. WORD 8");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
            // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (column == 3) {
                    System.out.print(mdArray[row][column] + " ");
                 }

              }
          }

              // WORD 9 A V E 
        System.out.println("");
        System.out.println("9. WORD 9");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
           // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 1 && (column == 1 || column == 2)) {
                  System.out.print(mdArray[row][column] + " ");
                 }
                  else if(row == 2 && (column == 1 || column == 2)) {
                     System.out.print(mdArray[row][column] + " ");
                  }
             
              }
          }

               // // WORD 10 
        System.out.println("");
        System.out.println("10. WORD 10");

         //outer loop - row
         for (int row = 0; row < 4; row++) {
           // line break
            System.out.println(" ");
              // inner loop - column
              for (int column = 0; column < 4; column++) {
                 if (row == 1 && (column == 1 || column == 2)) {
                  System.out.print(mdArray[row][column] + " ");
                 }
                  else if(row == 2 && (column == 1 || column == 2)) {
                     System.out.print(mdArray[row][column] + " ");
                  }
                  else if(row == 0 && (column == 0 || column == 3)) {
                     System.out.print(mdArray[row][column] + " ");
                  }
                  else if(row == 3 && (column == 0 || column == 3)) {
                     System.out.print(mdArray[row][column] + " ");
                  }
                  else{
                     System.out.print(" ");
                  }
              }
          }




    }
  }
