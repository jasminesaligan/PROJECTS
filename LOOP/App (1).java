public class App {
    public static void main(String[] args) throws Exception {
    
      int nameCount = 0;
      while (nameCount != 10) {
      
      nameCount++;
      if  (nameCount == 3) {
          System.out.println("Skip this part");
          continue;
      }
      System.out.println("Jasmine");
      }
      
      }
    }        