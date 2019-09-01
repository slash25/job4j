package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int newresult = first > second ? first : second;
        int result =  newresult > third ? newresult : third;
        return result;
    }
}
