package edu.monmouth.problem3week8;

import java.util.Scanner;

public class Problem3Week8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to remove: ");
        char targetChar = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != targetChar) {
                result.append(currentChar);
            }
        }

        String finalResult = result.toString();
        System.out.println("Result: " + finalResult);
    }
}
