package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","a","sd1",001);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","a","sd1",001);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2","b","sd2",002);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("b"));
    }

    /**
     *
     */
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item nextItem = new Item("test3","c","sd3",003);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(nextItem);
        Item nextItem2 = new Item("test4","d","sd4",004);
        Item nextItem3 = new Item("test5","e","sd5",005);
        tracker.add(nextItem2);
        tracker.add(nextItem3);
        assertThat(tracker.findAll(), is("some value"));
    }
}
