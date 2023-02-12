import java.util.Scanner;
public class Method1 {

 public static void main(String[] args)
    {
   
        System.out.println("Sum of 1 to 10 is: " + sum(1, 10));
        System.out.println("Sum of 20 to 37 is: " + sum(20, 37));
        System.out.println("Sum of 100 to 150 is: " + sum(100, 150));
        System.out.println("Sum of 20 to 30 is: " + sum(20, 30));
    }

public static int sum(int start, int end) {
    int result = 0;
    for (int i = start; i < end; i++) {
        result += i;
    }
    return result;
}

}

