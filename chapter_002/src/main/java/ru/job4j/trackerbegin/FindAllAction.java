package ru.job4j.trackerbegin;

import java.util.Arrays;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
      return "==== Find All ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        Item[] allItems;
        allItems = tracker.findAll();
        for (Item item : tracker.findAll()) {
            System.out.println((String.format("%s %s", item.getId(), item.getName())));
        }
        return true;
    }
}
