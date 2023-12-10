package edu.monmouth.problem2Week14;

public class Problem2Week14 {
    public static class DuplicateCheckProgram {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter the list of integers separated by spaces: ");
            String input = scanner.nextLine();

            try {
                java.util.List<Integer> numbers = parseInput(input);
                checkForDuplicates(numbers);
                System.out.println("No duplicates found. List is valid.");
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Error: Please enter valid integers separated by spaces.");
            } catch (DuplicateNumberException e) {
                System.out.println("Error: Duplicate numbers found - " + e.getMessage());
            }
        }

        private static java.util.List<Integer> parseInput(String input) {
            String[] numberStrings = input.split("\\s+");
            java.util.List<Integer> numbers = new java.util.ArrayList<>();

            for (String numberString : numberStrings) {
                int number = java.lang.Integer.parseInt(numberString);
                numbers.add(number);
            }

            return numbers;
        }

        private static void checkForDuplicates(java.util.List<Integer> numbers) throws DuplicateNumberException {
            java.util.Set<Integer> uniqueNumbers = new java.util.HashSet<>();

            for (int number : numbers) {
                if (!uniqueNumbers.add(number)) {
                    throw new DuplicateNumberException("Duplicate number found: " + number);
                }
            }
        }
    }

    static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }
}
