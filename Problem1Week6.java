package edu.monmouth.problem1Week6;

import java.util.Scanner;

public class Problem1Week6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}
