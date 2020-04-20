package ru.job4j.trackerbegintest;

public class TestTrackerSingle {

    public static void main(String[] args) {
        ru.job4j.trackerbegin.ts1.Tracker tracker1 = ru.job4j.trackerbegin.ts1.Tracker.INSTANCE;
        ru.job4j.trackerbegin.ts1.Tracker tracker1new = ru.job4j.trackerbegin.ts1.Tracker.INSTANCE;

        ru.job4j.trackerbegin.ts2.Tracker tracker2 = ru.job4j.trackerbegin.ts2.Tracker.getInstance();
        ru.job4j.trackerbegin.ts2.Tracker tracker2new = ru.job4j.trackerbegin.ts2.Tracker.getInstance();

        ru.job4j.trackerbegin.ts3.Tracker tracker3 = ru.job4j.trackerbegin.ts3.Tracker.getInstance();
        ru.job4j.trackerbegin.ts3.Tracker tracker3new = ru.job4j.trackerbegin.ts3.Tracker.getInstance();

        ru.job4j.trackerbegin.ts4.Tracker tracker4 = ru.job4j.trackerbegin.ts4.Tracker.getInstance();
        ru.job4j.trackerbegin.ts4.Tracker tracker4new = ru.job4j.trackerbegin.ts4.Tracker.getInstance();
    }
}
