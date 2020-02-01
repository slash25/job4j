package ru.job4j.trackerbegin;
import java.util.Arrays;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.add(item) != null) {
            System.out.println("New Item was created");
        } else {
            System.out.println("New Item was not created");
        }
    }

    public static void findAll(Input input, Tracker tracker) {
        System.out.println("==== Show all items ====");
        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println("All Items were shown");
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("==== Edit Item ====");
        String idn = input.askStr("Enter id: ");
        String itn = input.askStr("Enter  item");
        Item it = new Item(itn);
        if (tracker.replace(idn, it)) {
            System.out.println("Item was edited");

        } else {
            System.out.println("Item was not edited");
        }
    }


    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(" === Update item ====");
        String id = input.askStr("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        tracker.replace(id, item);
    }



    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete Item ====");
        String idn1 = input.askStr("Enter id: ");
        if (tracker.delete(idn1)) {
            System.out.println("Item was deleted");

        } else {
            System.out.println("Item was not deleted");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find Item by id ====");
        String idn2 = input.askStr("Enter id: ");
        if (tracker.findById(idn2) != null) {
            System.out.println("Item by id was finded");

        } else {
            System.out.println("Item by id was finded");

        }
    }


    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("==== Find Items by Name ====");

        String name1 = input.askStr("Enter name: ");
        //Item item = new Item(name1);
        if (tracker.findByName(name1) != null) {
            System.out.println("Item by name was finded");

        } else {
            System.out.println("Item by name was finded");

        }
    }


    private void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = input.askInt("");

            if (select == 0) {
                StartUI.createItem(input, tracker);

            } else if (select == 1) {
                StartUI.findAll(input, tracker);


            } else if (select == 2) {
                StartUI.editItem(input, tracker);


            } else if (select == 3) { /*replaceItem*/
                StartUI.replaceItem(input, tracker);

            } else if (select == 4) {
                StartUI.deleteItem(input, tracker);

            } else if (select == 5) {
                StartUI.findItemById(input, tracker);

            } else if (select == 6) {
                StartUI.findItemByName(input, tracker);

            } else if (select == 7) {
                System.out.println("==== You exit from program ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Replace item");
        System.out.println("4. Delete item");
        System.out.println("5. Find item by Id");
        System.out.println("6. Find items by name");
        System.out.println("7. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        //Вызов не статического метода. Необходимо обратиться через объект.
        new StartUI().init(input, tracker);
        // Вызов статического метода. Обращаемся через класс.
        //StartUI.createItem(input, tracker);
    }
}

