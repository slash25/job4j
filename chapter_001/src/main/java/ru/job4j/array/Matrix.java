package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for(int i = 1; i < table.length + 1; i++){
            for (int j = 1; j < table.length + 1; j++ ){
                table[i - 1][j - 1] = i * j;//массив начинается с нуля
            }
        }
        return table;
    }
}
