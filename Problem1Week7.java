package edu.monmouth.problem1Week7;

import java.util.Scanner;

public class Problem1Week7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        
        // Read input and convert to lowercase
        String word = scanner.nextLine().toLowerCase();

        int left = 0;
        int right = word.length() - 1;
        boolean Palindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                Palindrome = false;
                break;
            }
            left++; // moves left one position to the right 
            right--; // moves right one position to the left 
        }

        if (Palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

