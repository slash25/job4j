package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Random;

  class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[10];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**Метод удаляет заявку найдя её  по нужному id
     *
     * @param id input id
     */
    public boolean delete(String id){
        boolean res = false;
        int countPos = 0;
        if (findById(id) != null){//если пользователь есть в массиве
            res = true;
            for (Item updItem : this.items) {
                if (updItem != null){
                    this.items[countPos] = null;
                    break;
                }
                countPos ++;
            }
        }
        return res;
    }

    /**Метод находит заявку по id
     *
     * @param id input id
     * @return item
     */
    public Item findById(String id){
        for (Item item : this.items) {
            if (item.getId().equals(id)){
                return  item;
            }
        }
        return null;
    }

    /**Метод заменяет заявку найдя её по id
     *
     * @param id id
     * @param item item
     * @return  res
     */
    public    boolean replace(String id, Item item){
        int countPos = 0;
        boolean res = false;
        if (findById(id) != null){
            res = true;
            for (Item updItem : this.items) {
                if (updItem.getId().equals(id)){
                    this.items[countPos] = item;
                    break;
                }
                countPos ++;
            }
        }
        return res;
    }

    /**Метод выводит все заявки
     *
     * @return result
     */
    public    Item[] findAll (){
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++){
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
