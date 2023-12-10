package edu.monmouth.problem3Week14;

public class Problem3Week14 {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidSubBox(board, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] used = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                int digit = board[row][i] - '1';
                if (used[digit]) {
                    return false;
                }
                used[digit] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] used = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                int digit = board[i][col] - '1';
                if (used[digit]) {
                    return false;
                }
                used[digit] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int box) {
        boolean[] used = new boolean[9];
        int startRow = 3 * (box / 3);
        int startCol = 3 * (box % 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '1';
                    if (used[digit]) {
                        return false;
                    }
                    used[digit] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Output for board1: " + isValidSudoku(board1)); // Output: true
        System.out.println("Output for board2: " + isValidSudoku(board2)); // Output: false
    }
}
