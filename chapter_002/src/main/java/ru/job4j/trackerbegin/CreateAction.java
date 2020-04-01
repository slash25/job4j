package ru.job4j.trackerbegin;

import ru.job4j.trackerbegin.Input;
import ru.job4j.trackerbegin.Item;
import ru.job4j.trackerbegin.Tracker;
import ru.job4j.trackerbegin.UserAction;
import ru.job4j.trackerbegin.Item;

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
        item =  tracker.add(item);
        if (item != null) {
            System.out.println("New Item " + item + " was created");
        } else {
            System.out.println("New Item " + item + " wasn't created");
        }
        return true;
    }
}
