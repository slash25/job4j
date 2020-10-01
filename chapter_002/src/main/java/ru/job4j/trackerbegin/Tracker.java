package ru.job4j.trackerbegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();


    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод удаляет заявку найдя её  по нужному id
     *
     * @param id input id
     */
    boolean delete(String id) {
        boolean res = false;
        for (Item item : items) {

            if (item.getId().equals(id)) {
                item = null;
                //нужно сместить массив на 1 ячейку влево а предудущая ячейка стирается
                //System.arraycopy(items, count + 1, items, count, position - count);
                res = true;
                return res;
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
        for (Item it : items) {
            if (it.getId().equals(id)) {
                return it;
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
    ArrayList<Item> findByName(String name) {
        ArrayList<Item> result = new ArrayList<>();
        int j = 0;
        for (Item itName : items) {
            if (itName.getName().equals(name)) {
                result.add(itName);
            }
        }
        return result;
    }

    /**
     * Метод заменяет заявку найдя её по id
     *
     * @param id   id
     * @param item item
     * @return res
     */
    boolean replace(String id, Item item) {

        boolean res = true;

        for (Item itemId : items) {
            if (itemId.getId().equals(id)) {
                itemId = item;
                itemId.setId(id);
                return res;
            }
        }
        res = false;
        return res;
    }

    /**
     * Метод выводит все заявки
     *
     * @return result
     */
    ArrayList<Item> findAll() {
        return items;
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
        return "Tracker{" + "items=" + items + '}';
    }
}
