package application;

import entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeList> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf("\nEmployee #%d\n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            EmployeeList employee = new EmployeeList(id, name, salary);
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Integer pos = position(list, employeeId);

        if(pos == null) {
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("\nList of employees: ");
        for(EmployeeList emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    static Integer position(List<EmployeeList> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
