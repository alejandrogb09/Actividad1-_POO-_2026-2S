package actividad1;


public class EjercicioResuelto12 {
    public static void main(String[] args) {
        double grossSalary, withholdingTax, netPay;
        
        Employee emp = new Employee(48.0, 5000.0, 12.5);
        
        grossSalary = emp.grossSalary();
        withholdingTax = emp.withholdingTax();
        netPay = emp.netPay();
        
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Pay: " + netPay);
    }
}