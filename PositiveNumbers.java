package edu.monmouth.positiveNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class PositiveNumbers {

    public static void main(String[] args) {
        try {
            checkNumbersFromFile("/Users/laportam/Downloads/input.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.err.println("Positive number found: " + e.getMessage());
        }
    }

    private static void checkNumbersFromFile(String fileName) throws FileNotFoundException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }

        System.out.println("All numbers are non-positive.");
        scanner.close();
    }
}

