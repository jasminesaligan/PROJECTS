public class METHODS3 {
    public static void main(String[] args) throws Exception {
        // WEEK 9 DISCUSSION: Methods (PART 3)

        // TOPIC 3: return value with void
        
        // Example: Grade
        printGrade(getGrade());

    }

    // METHOD with return value

    public static double getGrade(){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter quiz 1: ");
        double q1 = sc.nextDouble();

        System.out.print("Enter quiz 2: ");
        double q2 = sc.nextDouble();

        System.out.print("Enter quiz 3: ");
        double q3 = sc.nextDouble();

        // output
        double grade = (q1 + q2 + q3)/3;

        return grade;
    }

        public static void printGrade(double average){
            System.out.print("Your grade is:  ");
            if(average >= 90){
                System.out.println('A');
            } else if(average>= 80) {
                System.out.println('B');
            } else if(average >= 70) {
                System.out.println('C');
            } else if(average >= 60) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }

        }
}
