package ru.job4j.trackerbegin;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
