import java.util.Scanner;

class Area {
    private double length;
    private double breadth;
    
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
}

public class co1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        Area area = new Area();
        area.setDim(length, breadth);
        System.out.println("Area of rectangle is: " + area.getArea());
    }
}
