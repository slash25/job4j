package ru.job4j.trackerbegin;

//enum. Eager loading.
public enum TrackerSingle {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Tracker add(Tracker model) {
        return model;
    }

}
