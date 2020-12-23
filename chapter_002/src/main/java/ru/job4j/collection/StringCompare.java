package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int res = 0;
        for (Character chLeft : leftChar) {
            for (Character rChar : rightChar) {
                res = Character.compare(chLeft, rChar);
            }
        }
        return (res < 0) ? -1 : ((res ==  0) ? 0 : 1);
       // (x < y) ? -1 : ((x == y) ? 0 : 1);

        //return Character.compare(leftChar, rightChar);
        // return String.charAt(int index);
    }

}
