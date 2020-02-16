package ru.job4j.trackerbegin;

import java.util.Arrays;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
      return "==== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(Arrays.toString(tracker.findAll()));
        return true;
    }
}
