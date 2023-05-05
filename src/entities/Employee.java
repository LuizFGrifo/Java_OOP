package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage) {
        double increase = grossSalary - tax + (grossSalary * percentage / 100);
        System.out.printf("Update data: %s, $ %.2f", name, increase);
    }
}
