package ru.job4j.loop;

public class MortgageWithFor {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int sum = 0;
        int amWithPerc;
        int y, month;
        amWithPerc = amount + (amount / 100 * (int) percent);

        for (y = 1; y < 12; y++) {
            for (month = 1; month <= 12; month++) {
                if (testAmWithPerc(amWithPerc, sum)) {
                    break;
                }
                sum += monthly;
            }
            year++;
            if (testAmWithPerc(amWithPerc, sum)) {
                break;
            }
        }
        return year;
    }

    private boolean testAmWithPerc(int amWithPerc, int sum) {
        return sum >= amWithPerc; //return true
    }
}