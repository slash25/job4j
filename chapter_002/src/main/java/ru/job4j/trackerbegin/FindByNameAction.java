package ru.job4j.trackerbegin;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name1 = input.askStr("Enter name: ");
        if (tracker.findByName(name1) != null) {
            System.out.println("Item by name " + name1 + " was  finded");

        } else {
            System.out.println("Item by name " + name1 + " wasn't  finded");
        }
        return true;
    }
}
