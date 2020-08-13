package collections;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */

    /*


 На каждой итерации сравнивать приоритет задачи которую добавляем с той которая
 нам доступна на этой итерации. Если приоритет той, которую добавляем ниже -
 выходим из цикла.
 После указанной проверки - мы инкрементируем переменную index.
     */
    public void put(Task task) {
        int index = 0;

        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }

        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
