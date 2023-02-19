import java.util.Scanner;

class Average {
    private double num1;
    private double num2;
    private double num3;
    
    public Average(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public void printAverage() {
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + average);
    }
}

public class co7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();
        
        Average average = new Average(num1, num2, num3);
        average.printAverage();
    }
}
