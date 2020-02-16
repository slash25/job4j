package ru.job4j.trackerbegin;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        if (tracker.add(item) != null) {
            System.out.println("New Item " + item + " was created");
        } else {
            System.out.println("New Item " + item + " wasn't created");
        }
        return true;
    }
}
