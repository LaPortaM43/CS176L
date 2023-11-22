package edu.monmouth.problem1Week11;

import java.util.Scanner;

public class Problem1Week11 {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            int count = num / values[i];

            for (int j = 0; j < count; j++) {
                romanNumeral.append(symbols[i]);
                num -= values[i];
            }
        }

        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 3999: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Please enter a valid number within the range.");
        } else {
            String romanNumeral = intToRoman(number);
            System.out.println("Roman Numeral: " + romanNumeral);
        }

        scanner.close();
    }
}


