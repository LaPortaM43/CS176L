package edu.monmouth.problem1Week11;

import java.util.Scanner;

public class Problem2Week11{

    public static int romanToDecimal(String roman) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int decimalValue = 0;

      
        for (int i = 0; i < roman.length(); i++) {
            char currentSymbol = roman.charAt(i);
            boolean found = false;

           
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j].charAt(0) == currentSymbol) {
                    
                    decimalValue += values[j];
                    found = true;
                    break;
                }
            }

           
            if (!found) {
                System.out.println("Invalid Roman numeral: " + roman);
                return -1; 
            }
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); 

        int decimalValue = romanToDecimal(romanNumeral);

        if (decimalValue != -1) {
            System.out.println("Decimal Value: " + decimalValue);
        }

        scanner.close();
    }
}

