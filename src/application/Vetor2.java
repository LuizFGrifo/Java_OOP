package application;

import entities.Product;
import util.ProductVector;

import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0, avg = 0;

        ProductVector[] vect = new ProductVector[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVector(name, price);
            sum += vect[i].getPrice();
        }

        avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f", avg);

        sc.close();
    }
}
