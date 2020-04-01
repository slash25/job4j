package ru.job4j.trackerbegintest;

import org.junit.Test;
import ru.job4j.trackerbegin.ValidateInput;
import ru.job4j.trackerbegin.ValidateStubInput;

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
        String[] data = {"test"};
        ValidateInput input = new ValidateStubInput(data);
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
        String[] data = {"one", "two", "three"};
        ValidateInput input = new ValidateStubInput(data);
        input.askInt("Enter");

        //Проверим содержимое вывода
        assertThat(
                mem,
                is(String.format("1"))
        );

        //Вернем системный вывод на консоль
        System.setOut(out);
    }

}
