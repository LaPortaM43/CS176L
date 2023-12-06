package edu.monmouth.problem1Week12;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Problem1Week12 {

    public static class HangmanGame {

        private static final String[] WORDS = {"pizza", "burger", "spaghetti", "chocolate", "sandwich", "pancake"};
        private String secretWord;
        private List<Character> guessedLetters;
        private int wrongGuessCount;

        public HangmanGame() {
            secretWord = selectRandomWord();
            guessedLetters = new ArrayList<>();
            wrongGuessCount = 0;
        }

        private String selectRandomWord() {
            Random random = new Random();
            return WORDS[random.nextInt(WORDS.length)];
        }

        private String getCurrentGuess() {
            StringBuilder currentGuess = new StringBuilder();
            for (char letter : secretWord.toCharArray()) {
                boolean letterGuessed = false;
                for (char guessedLetter : guessedLetters) {
                    if (guessedLetter == letter) {
                        letterGuessed = true;
                        break;
                    }
                }
                currentGuess.append(letterGuessed ? letter : "_").append(" ");
            }
            return currentGuess.toString();
        }

        private void displayGameStatus() {
            System.out.println("Currently, times you guessed wrongly: " + wrongGuessCount);

            printHangmanStatus();

            System.out.print("You already guessed the letters: ");
            for (char letter : guessedLetters) {
                System.out.print(letter + " ");
            }
            System.out.println("\nThe guessing word is: " + getCurrentGuess());
            System.out.println("The hint is: " + getHint());
        }

        private void printHangmanStatus() {
            System.out.print("The hangman has ");
            switch (wrongGuessCount) {
                case 1:
                    System.out.println("the head");
                    break;
                case 2:
                    System.out.println("the head, left arm");
                    break;
                case 3:
                    System.out.println("the head, left arm, right arm");
                    break;
                case 4:
                    System.out.println("the head, left arm, right arm, body");
                    break;
                case 5:
                    System.out.println("the head, left arm, right arm, body, left leg");
                    break;
                case 6:
                    System.out.println("the head, left arm, right arm, body, left leg, right leg");
                    break;
                default:
                    System.out.println("no parts");
            }
        }

        private String getHint() {
            switch (secretWord) {
                case "pizza":
                    return "food";
                case "burger":
                    return "food";
                case "spaghetti":
                    return "food";
                case "chocolate":
                    return "sweet";
                case "sandwich":
                    return "food";
                case "pancake":
                    return "breakfast";
                default:
                    return "unknown";
            }
        }

        private void playGame() {
            Scanner scanner = new Scanner(System.in);

            while (wrongGuessCount < 6 && !getCurrentGuess().equals(secretWord.replaceAll("", " "))) {
                displayGameStatus();

                System.out.print("Enter a letter: ");
                char guess = scanner.next().charAt(0);

                boolean alreadyGuessed = false;
                for (char guessedLetter : guessedLetters) {
                    if (guessedLetter == guess) {
                        alreadyGuessed = true;
                        break;
                    }
                }

                if (alreadyGuessed) {
                    System.out.println("You already guessed that letter. Try again.");
                    continue;
                }

                guessedLetters.add(guess);

                if (!secretWord.contains(String.valueOf(guess))) {
                    wrongGuessCount++;
                }
            }

            displayGameStatus();

            if (getCurrentGuess().equals(secretWord.replaceAll("", " "))) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
            } else {
                System.out.println("Sorry, you ran out of attempts. The correct word was: " + secretWord);
            }

            scanner.close();
        }
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.playGame();
    }
}



