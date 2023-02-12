import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] values = new int[n];
        System.out.print("Enter the values:");
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        int max = findMax(values);
        System.out.println("The maximum value is: " + max);
    }

    public static int findMax(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
