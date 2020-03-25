package ru.job4j.trackerbegintest;

import org.junit.Test;
import ru.job4j.trackerbegin.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

   /*По этому полю мы будет проверять выбрали мы пункт меню или нет.*/
   @Test
   public void whenExit() {
      StubInput input = new StubInput(
              new String[]{"0"}
      );
      StubAction action = new StubAction();
      new StartUI().init(input, new Tracker(), new UserAction[]{action});
      assertThat(action.isCall(), is(true));
   }

   /* Проверка метода showMenu, который печатает вывод меню*/
   @Test
   public void whenPrtMenu() {
      //Заменим вывод на наш буфер
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintStream def = System.out;
      System.setOut(new PrintStream(out));

      //Выполним действие с выводом на консоль
      StubInput input = new StubInput(new String[]{"0"});
      StubAction action = new StubAction();
      new StartUI().init(input, new Tracker(), new UserAction[]{action});

      //Проверим содержимое вывода
      String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
              .add("Menu.")
              .add("0. Stub action")
              .toString();
      assertThat(new String(out.toByteArray()), is(expect));

      //Вернем системный вывод на консоль
      System.setOut(def);
   }
}
