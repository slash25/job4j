package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {//2,3,4,5;
        int count = 0;

        for (int num = 2; num <= finish; num++) {
                    if ((num == 2) | (num == 3))
                        count++;

                    else if ((num % 2 == 0) | (num % 3 == 0)){
                    }

                    else
                    count++;
        }
        return count;
    }
}
