package ru.job4j.trackerbegin;
//StaticFieldLazyLoading
public class TrackerSingleC {
    private static TrackerSingleC instance;

    private TrackerSingleC() {
    }

    public static TrackerSingleC getInstance() {
        if (instance == null) {
            instance = new TrackerSingleC();
        }
        return instance;
    }

    public Tracker add(Tracker model) {
        return model;
    }
}
