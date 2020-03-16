package ru.job4j.trackerbegin;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {

    /*Протестируем вывод всех заявок*/

    @Test
    public void whenCheckOutput() {

        //Заменим вывод на наш буфер
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // 1. Создадим объект ByteArrayOutputStream.
        PrintStream def = System.out; // 2. Получаем ссылку на системный объект PrintStream
        System.setOut(new PrintStream(out)); //3. Устанавливаем в системный вывод объект из пункта 1.

        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindAllAction act = new FindAllAction();

        //Выполним действие с выводом на консоль
        act.execute(new StubInput(new String[]{}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getId() + " " + item.getName())
                .toString();

        //Проверим содержимое вывода
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def); // Вернем системный вывод на консоль
    }

}
