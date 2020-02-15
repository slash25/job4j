package ru.job4j.trackerbegin;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idn2 = input.askStr("Enter id: ");
        tracker.findById(idn2);
        return true;
    }
}
