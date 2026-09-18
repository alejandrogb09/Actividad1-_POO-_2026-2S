package actividad1;

import java.util.Scanner;
public class EjercicioResuelto17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double radius;
        
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        Circle cir = new Circle(radius);
        System.out.println("Area: " + cir.calculateArea());
        System.out.println("Length: " + cir.calculatePerimeter());
    }
}
