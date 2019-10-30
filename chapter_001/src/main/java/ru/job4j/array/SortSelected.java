package ru.job4j.array;

class SortSelected {
    static int[] sort(int[] data) {
        int indStart = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, indStart, data.length);
            int index = FindLoop.indexOf(data, min, indStart, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            indStart++;
        }
        return data;
    }
}
