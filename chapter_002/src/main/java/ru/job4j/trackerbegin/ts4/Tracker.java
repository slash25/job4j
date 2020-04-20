package ru.job4j.trackerbegin.ts4;

// private static final class. Lazy loading.
public class Tracker {
    private Tracker() {
        System.out.println("Tracker4 was created only once!");
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public ru.job4j.trackerbegin.Item add(ru.job4j.trackerbegin.Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}
