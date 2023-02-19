class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
}

public class co5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);
        
        System.out.println("Area of rectangle 1 is: " + rectangle1.getArea());
        System.out.println("Area of rectangle 2 is: " + rectangle2.getArea());
    }
}
