package edu.monmouth.problem2Week9;

import java.util.Scanner;

public class Problem2Week9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] count = new int[100000]; 
        int result = -1;

        for (int i = 0; i < n; i++) {
            int element = arr[i];

            if (count[element] == 1) {
                result = i; 
                break;
            } else {
                count[element] = 1;
            }
        }

        if (result != -1) {
            System.out.println("Index of the first repeating element: " + result);
        } else {
            System.out.println("No repeating element found.");
        }

        scanner.close();
    }
}
