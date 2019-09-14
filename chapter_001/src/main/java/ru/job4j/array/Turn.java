package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {

        for (int index = 0; index < array.length; index++) {
            int k = array.length - index - 1;
            if (index < array.length / 2) {
                int temp = array[index];
                array[index] = array[k];
                array[k] = temp;
            }
        }
        return array;
    }
}
