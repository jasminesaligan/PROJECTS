class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class co3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        System.out.println("Area of triangle is: " + triangle.getArea());
        System.out.println("Perimeter of triangle is: " + triangle.getPerimeter());
    }
}
