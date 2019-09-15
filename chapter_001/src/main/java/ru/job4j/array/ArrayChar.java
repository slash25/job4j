package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        for (int  index = 0; index < pref.length; index++){
            //if (pref[index] == word[index] )  result = true;
            result = pref[index] == word[index];
        }
        return result;
    }
}
