package ru.job4j.oop;
/**1. Создать класс ru.job4j.oop.Battery. в нем должно быть поле private int load.

 2. Создать метод public void exchange(Battery another).
 Этот метод должен списывать заряд из батареи у кого вызывали метод exchange и добавить к объекту another.
 *
 */
public class Battery {
    private int value;

    public Battery(int size){
        this.value = size;
    }

    public void exchange(Battery another){
        this.value = this.value - another.value;
        another.value = another.value + this.value;
    }

    public static void main(String[] args) {
       Battery battery1 = new Battery(20);
       Battery battery2 = new Battery(10);
        System.out.println("first : " + battery1.value + ". second : " + battery2.value);
        battery1.exchange(battery2);
        System.out.println("first : " + battery1.value + ". second : " + battery2.value);
    }
}
