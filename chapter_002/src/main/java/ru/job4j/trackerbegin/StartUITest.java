package ru.job4j.trackerbegin;

import org.junit.Test;

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
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintStream def = System.out;
      System.setOut(new PrintStream(out));
      StubInput input = new StubInput(
              new String[]{"0"}
      );
      StubAction action = new StubAction();
      new StartUI().init(input, new Tracker(), new UserAction[]{action});
      String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
              .add("Menu.")
              .add("0. Stub action")
              .toString();
      assertThat(new String(out.toByteArray()), is(expect));
      System.setOut(def);
   }


   /*Протестируем вывод всех заявок */
   @Test
   public void whenCheckOutput() {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintStream def = System.out;
      System.setOut(new PrintStream(out));

      Tracker tracker = new Tracker();
      Item item = new Item("fix bug");
      tracker.add(item);
      FindAllAction act = new FindAllAction();

      act.execute(new StubInput(new String[]{}), tracker);
      String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
              .add(item.getId() + " " + item.getName())
              .toString();
      assertThat(new String(out.toByteArray()), is(expect));
      System.setOut(def);
   }

   /*Протестируем поиск заявки по имени */
   @Test
   public void whenFindByName() {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintStream def = System.out;
      System.setOut(new PrintStream(out));

      Tracker tracker = new Tracker();
      Item item1 = new Item("test1");
      tracker.add(item1);
      Item item2 = new Item("test2");
      tracker.add(item2);
      FindByNameAction act = new FindByNameAction();

      act.execute(new StubInput(new String[]{}), tracker);
      String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
              .add(item1.getId() + " " + item1.getName())
              .toString();
      assertThat(new String(out.toByteArray()), is(expect));
      System.setOut(def);
   }
}
