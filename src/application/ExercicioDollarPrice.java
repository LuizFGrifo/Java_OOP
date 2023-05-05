package application;

import util.Calculator;
import util.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDollarPrice {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price ? ");
        Dolar.price = sc.nextDouble();

        System.out.print("How many dollars will be bought ? ");
        Dolar.bought = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", Dolar.amount()));

        sc.close();
    }
}
