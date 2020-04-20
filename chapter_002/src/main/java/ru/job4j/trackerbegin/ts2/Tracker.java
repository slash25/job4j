package ru.job4j.trackerbegin.ts2;

//StaticFieldLazyLoading
public class Tracker {
    private static Tracker instance;

    private Tracker() {
        System.out.println("Tracker2 was created only once!");
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public ru.job4j.trackerbegin.Item add(ru.job4j.trackerbegin.Item model) {
        return model;
    }
}
