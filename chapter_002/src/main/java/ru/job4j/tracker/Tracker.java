package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод удаляет заявку найдя её  по нужному id
     *
     * @param id input id
     */
    boolean delete(String id) {
        boolean res = false;
        if (findById(id) != null) {//если пользователь есть в массиве
            for (int count = 0; count < this.position; count++){
                if (items[count].getId().equals(id)) {
                    items[count] = null;
                    //нужно сместить массив на 1 ячейку влево а предудущая ячейка стирается
                    System.arraycopy(items, count + 1, items, count, position - count);
                    position--;
                    res = true;
                    return res;
                }

            }
        }
        return res;
    }


    /**
     * Метод находит заявку по id
     *
     * @param id input id
     * @return item
     */
    Item findById(String id) {
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Метод возвращает элементы у которых совпадает имя
     *
     * @param name input name
     * @return result
     */
    Item[] findByName(String name) {
        Item[] result = new Item[this.position];
        int j = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(name)) {
                result[j++] = items[i];
            }
        }
        return Arrays.copyOf(result, j);
    }

    /**
     * Метод заменяет заявку найдя её по id
     *
     * @param id   id
     * @param item item
     * @return res
     */
    public boolean replace(String id, Item item) {
        Item[] result = new Item[this.position];
        int countPos = 0;
        boolean res = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                item.setId(id);
                result[countPos++] = item;
                res = true;
                Arrays.copyOf(result, countPos);
            }
        }
        return res;
    }

    /**
     * Метод выводит все заявки
     *
     * @return result
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "items=" + Arrays.toString(items) +
                ", position=" + position +
                '}';
    }
}
