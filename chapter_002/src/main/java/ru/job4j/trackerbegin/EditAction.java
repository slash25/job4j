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
        tracker.replace(idn, it);
        return true;
    }
}
