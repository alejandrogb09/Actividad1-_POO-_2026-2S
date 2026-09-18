package actividad1;

public class CalculatePower {
    double number;
    
    public CalculatePower(double number) {
        this.number = number;
    }
    
    public double calculateSquare() {
        return Math.pow(number, 2);
    }
    
    public double calculateCube() {
        return Math.pow(number, 3);
    }
}
