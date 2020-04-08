package ru.job4j.trackerbegin;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }
/*
  System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Replace item");
        System.out.println("4. Delete item");
        System.out.println("5. Find item by Id");
        System.out.println("6. Find items by name");
        System.out.println("7. Exit Program");
 */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new FindAllAction(), new EditAction(),
                new ReplaceAction(), new DeleteAction(), new FindByIdAction(),
                new FindByNameAction(), new ExitAction(),
        };
        new StartUI().init(validate, tracker, actions);
    }
}

