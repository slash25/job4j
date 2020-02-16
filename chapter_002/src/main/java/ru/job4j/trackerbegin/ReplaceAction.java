package ru.job4j.trackerbegin;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
      return   " === Update item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item with name " + name + " and id " + id + " was replaced");
        } else {
            System.out.println("Item with name " + name + " and id " + id + " wasn't replaced");
        }
        return  true;
    }
}
