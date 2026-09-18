package actividad1;

import java.util.Scanner;
public class EjercicioResuelto14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double number;
        
        System.out.println("Enter a number: ");
        number = input.nextDouble();
        
        CalculatePower pow = new CalculatePower(number);
        
        System.out.println("Number entered: " + number);
        System.out.println("Square: " + pow.calculateSquare());
        System.out.println("Cube: " + pow.calculateCube());
    }
}
