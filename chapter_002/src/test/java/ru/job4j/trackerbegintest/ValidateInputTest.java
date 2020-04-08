package ru.job4j.trackerbegintest;

import org.junit.Test;
import ru.job4j.trackerbegin.StubInput;
import ru.job4j.trackerbegin.ValidateInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        //Заменим вывод на наш буфер
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));

        //Выполним действие с выводом на консоль
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.askInt("Enter");

        //Проверим содержимое вывода
        assertThat(
                mem,
                is(String.format("Please enter validate data again.%n"))
        );

        //Вернем системный вывод на консоль
        System.setOut(out);
    }

    @Test
    public void whenValidInput() {
        //Заменим вывод на наш буфер
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));

        //Выполним действие с выводом на консоль
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "two", "three"})
        );
        input.askInt("Enter");

        //Проверим содержимое вывода
        assertThat(
                mem,
                is(String.format("Please enter validate data again.%n"))
        );

        //Вернем системный вывод на консоль
        System.setOut(out);
    }

}
