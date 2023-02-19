import java.util.Scanner;

class Area {
    private double length;
    private double breadth;
    
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double returnArea() {
        return length * breadth;
    }
}

public class co6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();
        
        Area rectangle = new Area(length, breadth);
        double area = rectangle.returnArea();
        
        System.out.println("The area of the rectangle is: " + area);
    }
}
