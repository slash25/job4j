package ru.job4j.tracker;
import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String askInt(String question) { //все методы в интерфейсе имеют модификатор public
        System.out.print(question);
        return scanner.nextLine();
    }

}
