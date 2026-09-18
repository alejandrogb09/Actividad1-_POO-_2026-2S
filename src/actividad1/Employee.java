package actividad1;

public class Employee {
    double hoursWorked, hourlyRate, withholdingPercentage;
    
    public Employee(double hoursWorked, double hourlyRate, double withholdPercentage) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.withholdingPercentage = withholdPercentage;
    }
    
    public double grossSalary() {
        return hoursWorked * hourlyRate;
    }
    
    public double withholdingTax() {
        return grossSalary() * (withholdingPercentage/100);
    }
    
    public double netPay() {
        return grossSalary() - withholdingTax();
    }
}