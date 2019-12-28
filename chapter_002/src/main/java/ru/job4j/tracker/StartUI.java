package ru.job4j.tracker;

import java.util.Scanner;
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("==== Create a new Item ====");

                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("==== Show all items ====");
                System.out.println(tracker.findAll());
            }
            else if (select == 2){
                System.out.println("==== Edit Item ====");
                System.out.println("Edit item");
                System.out.println("Enter id: ");
                String idn = scanner.nextLine();

                System.out.println("Enter  item");
                String itn = scanner.nextLine();
                Item it = new Item(itn);
                tracker.replace(idn,it);
            }
            else if (select == 3){
                System.out.println("==== Delete Item ====");
                System.out.println("Enter id: ");
                String idn = scanner.nextLine();
                tracker.delete(idn);
            }
            else  if (select == 4){
                System.out.println("==== Find Item by id ====");
                System.out.println("Enter id: ");
                String idn = scanner.nextLine();
                tracker.findById(idn);
            }
            else if (select == 5){
                System.out.println("==== Find Items by Name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.findByName(name);
            }
             else if (select == 6) {
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
