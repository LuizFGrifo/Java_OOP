package application;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int negative = 0;
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");

        for(int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] < 0) {
                    negative += 1;
                }
            }
        }

        System.out.println("\nNegative numbers = " + negative);

        sc.close();
    }
}
