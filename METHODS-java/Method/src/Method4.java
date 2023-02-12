import java.util.Scanner;
public class Method4 {
    public static void main(String[] args) {
        
        printGrade(getGrade());
     
    }

    //Methods with return value 
    public static double getGrade() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter quiz 1: ");
        double q1 = sc.nextDouble();
        System.out.print("Enter quiz 2: ");
        double q2 = sc.nextDouble();
        System.out.print("Enter quiz 3: ");
        double q3 = sc.nextDouble();

        double grade = (q1 + q2 + q3) / 3;

        return grade;
        
    }


    // void method has no return value
    // return statement can be used to terminate the void method

    public static void printGrade(double average) {
        System.out.print("Your grade is: ");
        if (average < 0 || average > 100) {
            System.out.println("invalid");
            return;
        }

        if (average >= 90) {
            System.out.println('A');
        } else if (average >= 80) {
            System.out.println('B');
        }else if (average >= 70) {
            System.out.println('C');
        }else if (average >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

}
