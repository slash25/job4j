package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {//2,3,4,5;
        int count = 0;

        int i,j;
        mark1:for ( i = 2; i <= finish; i++ ) {
            for ( j = (int)Math.sqrt( i ); j != 1; j-- ) {
                if ( i % j != 0 ) {
                    continue mark1;
                }
            }
            count++;
        }
        return count;
    }
}
