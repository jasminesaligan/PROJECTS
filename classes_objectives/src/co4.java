class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class co4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        
        System.out.println("Area of triangle is: " + triangle.getArea());
        System.out.println("Perimeter of triangle is: " + triangle.getPerimeter());
    }
}
