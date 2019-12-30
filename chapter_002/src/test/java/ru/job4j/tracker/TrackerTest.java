package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "a", "sd1", 001);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "a", "sd1", 001);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "b", "sd2", 002);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        boolean replace = tracker.replace(previous.getId(), next);

        System.out.println(Arrays.deepToString(tracker.findAll()));
        // Проверяем, что заявка с таким id имеет новые имя test2.
        ///assertThat(tracker.findAll(), is(replace));
    }

    @Test
    public void deleteById() {
        Tracker tracker = new Tracker();
        Item previous = new Item("001", "a", "sd2", 003);
        Item previous1 = new Item("002", "b", "sd3", 004);
        Item previous2 = new Item("003", "c", "sd4", 005);
        Item previous3 = new Item("004", "d", "sd5", 005);
        tracker.add(previous);
        tracker.add(previous1);
        tracker.add(previous2);
        Item add = tracker.add(previous3);
        tracker.delete(previous3.getId());
        ///assertThat(tracker.findAll(), is(new Item[]{add}));
        System.out.println(Arrays.deepToString(tracker.findAll()));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item previous2 = new Item("test3", "test", "sd4", 005);
        Item previous3 = new Item("test4", "test", "sd5", 006);
        Item previous4 = new Item("test4", "proba", "sd6", 007);
        Item previous5 = new Item("test5", "proba1", "sd7", 110);
        tracker.add(previous2);
        tracker.add(previous3);
        tracker.add(previous4);
        tracker.add(previous5);
        System.out.println(Arrays.deepToString(tracker.findByName("test")));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item nextItem = new Item("test3", "c", "sd3", 003);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(nextItem);
        Item nextItem2 = new Item("test4", "d", "sd4", 004);
        Item nextItem3 = new Item("test5", "e", "sd5", 005);
        tracker.add(nextItem2);
        tracker.add(nextItem3);
        System.out.println(Arrays.toString(tracker.findAll()));
    }
}
