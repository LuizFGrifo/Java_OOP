package application;

import entities.Rent;

import java.util.Scanner;

public class ExercicioPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int room = sc.nextInt();

        for (int i = 1; i <= room; i++) {
            System.out.printf("\nRent #%d:\n", i);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);

            vect[roomNumber] = rent;
        }

        System.out.println("\nBusy rooms:");

        for(int i = 0; i < vect.length; i++) {
            if(vect[i] != null)
                System.out.println(i + ": " + vect[i]);
        }

        sc.close();
    }
}
