package ru.job4j.trackerbegin;
//static final field. Eager loading.
public class TrackerSingleEL {
    private static final TrackerSingleEL INSTANCE = new TrackerSingleEL();

    private TrackerSingleEL() {
    }

    public static TrackerSingleEL getInstance() {
        return INSTANCE;
    }

    public Tracker add(Tracker model) {
        return model;
    }

}
