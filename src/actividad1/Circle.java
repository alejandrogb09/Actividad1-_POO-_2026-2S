package actividad1;

public class Circle {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
