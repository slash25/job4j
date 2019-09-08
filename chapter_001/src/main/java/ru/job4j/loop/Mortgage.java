package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int amWithPerc = amount + (amount / 100 * (int) percent);
        int newSum = 0;

        while (newSum <= amWithPerc) {
           int sum = newSum;
            newSum = countSum(sum, monthly, amWithPerc);
            year++;
        }
        return year;
    }

    private int countSum(int sum, int monthlys, int am) {
        for (int month = 1; month <= 12; month++) {
            if (am < sum) {
                break;
            }
            sum += monthlys;
        }
        return sum;
    }
}
