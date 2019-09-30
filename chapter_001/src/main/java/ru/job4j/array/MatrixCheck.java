package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;

        if (provHorizontX(board)) {
            result = true; // у метода результат будет ложь если эту строку не использовать
            return result;
        }
        if (provVerticalX(board)) {
            result = true;
            return result;
        }
        return result;
    }
    private static boolean provHorizontX(char[][] board) {
        boolean result = false;
        int countXj = 0;

        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) { //проверить последовательность.
                if (chars[j] == 'X') {
                    countXj = countXj + 1;
                }
                if (countXj == board.length) {
                    result = true;
                    return result;
                }
            }
            countXj = 0;
        }
        return result;
    }

    private static boolean provVerticalX(char[][] board) {
        boolean result = false;
        int countXj = 0;

        for (int i = 0; i < board.length; i++) {
            for (char[] chars : board) { //проверить последовательность.
                if (chars[i] == 'X') {
                    countXj = countXj + 1;
                }
                if (countXj == board.length) {
                    result = true;
                    return result;
                }
            }
            countXj = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}

