package ru.job4j.trackerbegin;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    /*Протестируем поиск заявки по имени */
    @Test
    public void whenFindByName() {

        //Заменим вывод на наш буфер
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // 1. Создадим объект ByteArrayOutputStream.
        PrintStream def = System.out; // 2. Получаем ссылку на системный объект PrintStream
        System.setOut(new PrintStream(out)); //3. Устанавливаем в системный вывод объект из пункта 1.

        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.add(item1);
        Item item2 = new Item("test2");
        tracker.add(item2);
        FindByNameAction act = new FindByNameAction();
        //StubInput input = new StubInput(new String[]{"0"});
        //StubAction action = new StubAction();



        //Выполним действие с выводом на консоль
        act.execute(new StubInput(new String[]{"test1"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item1.getId() + " " + item1.getName()).toString();

        //Проверим содержимое вывода
        assertThat(new String(out.toByteArray()), is(expect));

        System.setOut(def); // Вернем системный вывод на консоль
    }
}
