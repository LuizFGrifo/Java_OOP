package application;
import entities.ContaBancaria;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String option = sc.next();
        ContaBancaria conta = new ContaBancaria(accountNumber, holder);

        if(option.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            conta.deposit(deposit);
        }

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        System.out.println("Updated account data:");
        conta.deposit(newDeposit);
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        double witdraw = sc.nextDouble();
        System.out.println("Updated account data:");
        conta.withdraw(witdraw);
        System.out.println(conta);

        sc.close();
    }
}
