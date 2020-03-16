package ru.job4j.trackerbegin;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name1 = input.askStr("Enter name: ");
        Item[] findName;
        findName = tracker.findByName(name1);
        if (findName.length > 0) {
            for (Item it : findName) {
                System.out.println(it.getId() + " " + it.getName());
            }
        } else {
            System.out.println("Item by name " + name1 + " wasn't  finded");
        }
        return true;
    }
}
