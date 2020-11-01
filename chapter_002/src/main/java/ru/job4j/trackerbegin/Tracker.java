package ru.job4j.trackerbegin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();


    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     * @return items
     */
    List<Item> add(Item item) {
        items.add(item);
        return items;
    }

    /**
     * Метод удаляет заявку найдя её  по нужному id
     *
     * @param id input id
     * @return true or false
     */
    boolean delete(String id) {
        Integer index = findIndexById(id);
            if (index != null) {
                items.remove((int) index);
                return true;
            //нужно сместить массив на 1 ячейку влево а предудущая ячейка стирается
            //System.arraycopy(items, count + 1, items, count, position - count);
        }
        return false;
    }


    /**
     * Метод находит заявку по id
     *
     * @param id input id
     * @return item or null
     */
    Item findById(String id) throws NullPointerException {
        try {
            for (Item it : items) {
                if (it.getId().equals(id)) {
                    return it;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Can't find item with id " + id);
        }
        return null;
    }


    /**
     * Метод находит индекс по id
     *
     * @param id input id
     * @return index or null
     */
   private Integer findIndexById(String id) throws NullPointerException {
        int index = 0;
        try {
            for (Item it : items) {
                if (it.getId().equals(id)) {
                    return index;
                }
                index++;
            }

        } catch (NullPointerException e) {
            System.out.println("Can't find item with id " + id);
        }
        return null;
    }



    /**
     * Метод возвращает элементы у которых совпадает имя
     *
     * @param name input name
     * @return result
     */
    List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
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
     * @return true or false
     */
    boolean replace(String id, Item item) {
        Integer index = findIndexById(id);
        if (index != null) {
                items.set((int) index, item);
                return true;
        }
        return false;
    }

    /**
     * Метод выводит все заявки
     *
     * @return items
     */
    List<Item> findAll() {
        return items;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание.
     * Для идентификации нам нужен уникальный ключ.
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
