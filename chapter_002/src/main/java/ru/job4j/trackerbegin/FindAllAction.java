package ru.job4j.trackerbegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
      return "==== Find All ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        List<Item> allItems;
        allItems = tracker.findAll();
        for (Item item : allItems) {
            System.out.println((String.format("%s %s", item.getId(), item.getName())));
        }
        return true;
    }
}
