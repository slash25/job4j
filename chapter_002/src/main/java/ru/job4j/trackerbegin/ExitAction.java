package ru.job4j.trackerbegin;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "==== You exit from program ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
