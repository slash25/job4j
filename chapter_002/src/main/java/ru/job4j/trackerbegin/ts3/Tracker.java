package ru.job4j.trackerbegin.ts3;

import ru.job4j.trackerbegin.*;

//static final field. Eager loading.
public class Tracker {
    private static final Tracker INSTANCE = new Tracker();

    private Tracker() {
        System.out.println("Tracker3 was created only once!");
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
