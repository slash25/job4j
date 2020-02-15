package ru.job4j.trackerbegin;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name1 = input.askStr("Enter name: ");
        tracker.findByName(name1);
        return true;
    }
}
