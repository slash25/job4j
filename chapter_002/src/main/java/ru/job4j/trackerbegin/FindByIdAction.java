package ru.job4j.trackerbegin;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idn2 = input.askStr("Enter id: ");
        if (tracker.findById(idn2) != null) {
            System.out.println("Item with id: " + idn2 + " was finded");

        } else {
            System.out.println("Item with id: " + idn2 + " wasn't  finded");
        }
        return true;
    }
}
