package edu.monmouth.problem2Week8;

import java.util.Scanner;

public class Problem2Week8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String inputString = input.nextLine();
        String reversedString = reverse(inputString);

        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
