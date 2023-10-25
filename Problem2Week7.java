package edu.monmouth.problem2Week7;

import java.util.Scanner;

public class Problem2Week7 {

    public static void main(String[] args) {
        final int UPPERLIMIT = 1000;
        final int LOWERLIMIT = 0;

        Scanner scanner = new Scanner(System.in);

        int num1, num2, gcd = 0;

        do {
            System.out.println("Enter a positive number between 0-1000: ");
            num1 = scanner.nextInt();

            if (num1 < LOWERLIMIT || num1 > UPPERLIMIT) {
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        } while (num1 < LOWERLIMIT || num1 > UPPERLIMIT);

        
        do {
            System.out.println("Enter another positive number between 0-1000: ");
            num2 = scanner.nextInt();
            
            if (num2 < LOWERLIMIT || num2 > UPPERLIMIT) {
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        } while (num2 < LOWERLIMIT || num2 > UPPERLIMIT);

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd);

        scanner.close();
    }
}
