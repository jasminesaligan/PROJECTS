public class Main
{
    public static void main(String[] args) {
      char[] name = {'J', 'A', 'S', 'M', 'I', 'N', 'E'};
    //   System.out.println(name[1]);
    //   System.out.println(name[6]);
    //   System.out.println(name[0]);
    // for 
      for (int i = 0; i < name.length; i++) {
       if (name[i] == 'A' || name[i] == 'I' || name[i] == 'E') {
				// Display each vowel
				System.out.println(name[i]); 
             
       }
	      // to constant
	       if (!(name[i] == 'J' || name[i] == 'S' || name[i] == 'M' || name[i] == 'N')) {
				// Display each vowel
				System.out.println(name[i]); 
             
       }
        //   System.out.println(name[i]);
      }
    
    }
}
