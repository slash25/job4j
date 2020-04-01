package ru.job4j.trackerbegin;

public interface Input {
    String askStr(String question);
    int askInt(String question);
    int askInt(String question, int max); //Этот метод будет запрашивать ввод данных от пользователя
    // пока пользователь не введет число от 0 до max.
}
