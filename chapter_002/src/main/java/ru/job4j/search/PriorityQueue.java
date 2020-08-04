package ru.job4j.search;
import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
            if (task.getDesc().contains("low")) {
                index = 0;
            } else if (task.getDesc().contains("urgent")) {
                index = 0;
            } else if (task.getDesc().contains("middle")) {
                index = 1;
        }

            this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
