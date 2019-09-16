package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        int counter = 0;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] == word[index]) {
                counter++;
            }
            /*if (counter == pref.length){
                result = true;
            }else result = false;*/

            result = counter == pref.length;
        }
        return result;
    }
}
