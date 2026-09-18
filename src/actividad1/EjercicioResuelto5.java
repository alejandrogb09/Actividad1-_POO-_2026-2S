package actividad1;

public class EjercicioResuelto5 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        double x = 20;
        double y = 40;
        
        sum1 = Operations.sum1(sum1, x);
        x = Operations.calculateX(x, y);
        sum2 = Operations.sum2(x, y, sum1);
        
        System.out.println("The value of the sum is: " + sum2);
    }
}
