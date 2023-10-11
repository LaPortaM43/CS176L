package edu.monmouth.problem3Week5;

import java.util.Scanner;

public class Problem3Week5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char firstChar = input.charAt(0);

        if (Character.isDigit(firstChar)) {
            String digitWord = getDigitWord(firstChar);
            String modifiedInput = digitWord + input.substring(1);
            System.out.println("Modified string: " + modifiedInput);
        } else {
            System.out.println("First character is not a numerical digit.");
        }
    }

    private static String getDigitWord(char digit) {
        switch (digit) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "";
        }
    }
}
