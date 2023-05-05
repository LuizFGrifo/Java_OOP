package application;

import entities.Employee;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioEmploye {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double increase;

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee.name + ", $ "+ String.format("%.2f", employee.netSalary()));

        System.out.println();
        System.out.print("Which percentage to increase salary ? ");
        increase = sc.nextDouble();

        System.out.println();
        employee.increaseSalary(increase);
        sc.close();
    }
}
