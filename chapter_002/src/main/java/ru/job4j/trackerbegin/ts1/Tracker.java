package ru.job4j.trackerbegin.ts1;

import ru.job4j.trackerbegin.Item;

//enum. Eager loading.
public enum Tracker {
    INSTANCE; // здесь мы указываем перечисления.
    private Tracker() {
        System.out.println("Tracker1 was created only once!");
    }

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }
}
