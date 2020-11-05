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
        int index = findIndexById(id);
            if (index != -1) {
                items.remove(index);
                return true;
        }
        return false;
    }


    /**
     * Метод находит заявку по id
     *
     * @param id input id
     * @return item or null
     */
    Item findById(String id) {

            for (Item it : items) {
                if (it.getId().equals(id)) {
                    return it;
                }
            }
            System.out.println("Can't find item with id " + id);
        return null;
    }


    /**
     * Метод находит индекс по id
     *
     * @param id input id
     * @return index or null
     */
   private Integer findIndexById(String id) {
        int index = 0;
            for (Item it : items) {
                if (it.getId().equals(id)) {
                    return index;
                }
                index++;
            }
            System.out.println("Can't find item with id " + id);
        return -1;
    }



    /**
     * Метод возвращает элементы у которых совпадает имя
     *
     * @param name input name
     * @return result
     */
    List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
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
        int index = findIndexById(id);
        if (index != -1) {
                items.set(index, item);
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
