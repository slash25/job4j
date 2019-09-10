package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int sqr = 1 ;
        for (int i = 0; i < rst.length; i++){

            rst[i] = (int) Math.pow(sqr,2);
            sqr++;
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }

}
