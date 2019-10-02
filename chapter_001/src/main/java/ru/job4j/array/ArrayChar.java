package ru.job4j.array;

public class ArrayChar {
    static boolean startsW(char[] word, char[] pref) {
        boolean result = true;
        int counter = 0;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
