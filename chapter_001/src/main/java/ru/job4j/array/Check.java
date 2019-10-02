package ru.job4j.array;

// сравниваем элементы по очереди с первым, если нашли разницу то фолс и брейк
public class Check {
    public boolean mono(boolean[] data) {
        boolean firsElement = data[0];
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != firsElement) { //if value == true
                result = false;
                break;
            }
        }
        return result;
    }
}

