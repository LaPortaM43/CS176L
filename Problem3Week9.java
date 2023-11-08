package edu.monmouth.problem3Week9;

import java.util.Scanner;

public class Problem3Week9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("The array is empty. No non-repeating element found.");
            return;
        }

        int maxElement = arr[0]; 

        
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

 
        int[] frequencyArray = new int[maxElement + 1];

      
        for (int num : arr) {
            frequencyArray[num]++;
        }

        
        int firstNonRepeating = -1;

        for (int num : arr) {
            if (frequencyArray[num] == 1) {
                firstNonRepeating = num;
                break;
            }
        }

        if (firstNonRepeating != -1) {
            System.out.println("The first non-repeating element in the array is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating element found in the array.");
        }

        scanner.close();
    }
}

