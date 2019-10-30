package ru.job4j.array;

class MinDiapason {
    static int findMin(int[] data, int minval, int length) {
        int min = data[minval];
        int i = minval + 1;
        for (int  ind = i; ind < length; ind++) {
            if (min > data[ind]) {
                min = data[ind];
            }
        }
        return min;
    }
}
