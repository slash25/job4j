package ru.job4j.array;

import java.util.Arrays;

public class arrQuest {

    public static int[]  Array(int [] arr1, int[] arr2) {
        int[] newint = new int[2];
        int i = 0;
        for (int var: arr1) {
            for (int var2: arr2) {
                if (var == var2){
                    newint[i] = var;
                    i++;
                }
            }
        }
        return newint;
    }
}
