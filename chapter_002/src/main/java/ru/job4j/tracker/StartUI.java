package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            switch (select) {
                case (0): {
                    System.out.println("==== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    if (tracker.add(item) != null)
                        System.out.println("New Item was created");
                    else
                        System.out.println("New Item was not created");
                }
                case (1): {
                    System.out.println("==== Show all items ====");
                    System.out.println(tracker.findAll());
                    System.out.println("All Items were shown");
                }
                case (2): {
                    System.out.println("==== Edit Item ====");
                    System.out.println("Edit item");
                    System.out.println("Enter id: ");
                    String idn = scanner.nextLine();

                    System.out.println("Enter  item");
                    String itn = scanner.nextLine();
                    Item it = new Item(itn);
                    if (tracker.replace(idn, it)) {
                        System.out.println("Item was edited");
                    } else
                        System.out.println("Item was not edited");
                }
                case (3): {
                    System.out.println("==== Delete Item ====");
                    System.out.println("Enter id: ");
                    String idn = scanner.nextLine();
                    if (tracker.delete(idn)) {
                        System.out.println("Item was deleted");
                    } else
                        System.out.println("Item was not deleted");
                }
                case (4): {
                    System.out.println("==== Find Item by id ====");
                    System.out.println("Enter id: ");
                    String idn = scanner.nextLine();
                    if (tracker.findById(idn) != null)
                        System.out.println("Item by id was finded");
                    else System.out.println("Item by id was finded");
                }
                case (5): {
                    System.out.println("==== Find Items by Name ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    if (tracker.findByName(name) != null)
                        System.out.println("Item by name was finded");
                    else
                        System.out.println("Item by name was finded");
                }
                case (6): {
                    System.out.println("==== You exit from program ====");
                    run = false;
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
