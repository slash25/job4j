package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        int countTue = 0;
        int counFalse = 0;
        boolean result = false;
        for (boolean value :  data) {
            if (value) { //if value == true
                countTue++;
            } else {
                counFalse++;
            }
        }

        if (countTue == data.length | counFalse == data.length) {
            result = true;
        }
        return result;
    }
}
