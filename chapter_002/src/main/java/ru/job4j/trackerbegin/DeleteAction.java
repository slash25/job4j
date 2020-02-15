package ru.job4j.trackerbegin;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "==== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idn = input.askStr("Enter id: ");
        tracker.delete(idn);
        return true;
    }
}
