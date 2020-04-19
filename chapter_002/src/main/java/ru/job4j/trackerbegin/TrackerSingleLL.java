package ru.job4j.trackerbegin;
// private static final class. Lazy loading.
public class TrackerSingleLL {
    private TrackerSingleLL() {
    }

    public static TrackerSingleLL getInstance() {
        return Holder.INSTANCE;
    }

    public Tracker add(Tracker model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleLL INSTANCE = new TrackerSingleLL();
    }
}
