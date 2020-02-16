package ru.job4j.trackerbegin;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return  "==== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idn = input.askStr("Enter id: ");
        String itn = input.askStr("Enter  item");
        Item it = new Item(itn);
        if (tracker.replace(idn, it)) {
            System.out.println("Item " + itn + " was edited");

        } else {
            System.out.println("Item " + itn + " wasn't edited");
        }
        return true;
    }
}
