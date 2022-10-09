import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    // Answers
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

        // Part 1: Conversions
        // Print the converted values

        // 1. Create a method to convert celsius to fahrenheit.
        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        double temptoFahrenheit = (tempInCelsius*1.8 + 32);
        System.out.println("The temperature converted to fahrenheit is: " + temptoFahrenheit + " F° ");
        
        // 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = scan.nextDouble();
        double temptoCelsius = (tempInFahrenheit-32*0.5556);
        System.out.println("The temperature converted to celcius is: " + temptoCelsius + " C° ");


        // 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = (seconds/60);
        System.out.println("The time converted to minutes is: " + minutes + "minuties ");



        // 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        double minutes2 = (hours*60);
        System.out.println("The time converted to minutes is: " + minutes2 + "minutes ");

        // 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        double gigabytes = (megabytes/1000);
        System.out.println("The gigabytes is: " + gigabytes + "gigabytes ");

        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given mobile number is valid

        System.out.print("Enter your 11 digit mobile number: ");
        String mobileNumber = scan.next();
        if (mobileNumber.length() == 11) {
            System.out.println("Valid");
        }
        else System.out.println("Invalid");



        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();
        if (bestfriend == bestfriend.toUpperCase()) {
            System.out.println("Valid");
        }
        else System.out.println("Invalid");

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
        String capital = scan.next(); 
        if (capital.toUpperCase() == ("MANILA") || capital.toLowerCase() == ("manila")) {
          System.out.println("Valid");
        }
        else System.out.println("Invalid");
        


        // 9. Create a condition to check if the answer is belongs to one of the five human senses
        // sight
        // touch
        // hearing
        // smell
        // taste

        System.out.print("Enter one of the five human senses: ");
        String sense = scan.next();
        switch (sense) {
            case "sight":
            System.out.println("Valid ");
            break;

            case "touch":
            System.out.println("Valid ");
            break;

            case "hearing":
            System.out.println("Valid ");
            break;

            case "smell":
            System.out.println("Valid ");
            break;

            case "taste":
            System.out.println("Valid ");
            break;

            default:
            System.out.println("Invalid ");
        
    

        }



    }
}
