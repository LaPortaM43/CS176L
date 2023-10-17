package edu.monmouth.problem2Week6;

import java.util.Scanner;

public class Problem2Week6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Hello, " + name + ", how many exams have you taken? ");
        int numExams = scanner.nextInt();
        
        double totalScore = 0;
        int validScores = 0;

        for (int i = 1; i <= numExams; ) {
            System.out.print("Give me the score of exam " + i + ": ");
            int score = scanner.nextInt();
            
            if (score >= 0 && score <= 100) {
                totalScore += score;
                validScores++;
                i++;  // Increment i if the score is valid
            } else {
                System.out.println("Invalid score! Please provide a score between 0 and 100.");
            }
        }
        
        if (validScores > 0) {
            double average = totalScore / validScores;
            System.out.println("Hi, " + name + ", your average score of " + numExams + " exams is " + average);
        } else {
            System.out.println("No valid scores provided. Cannot calculate the average.");
        }
    }
}

