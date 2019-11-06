package ru.job4j.oop;

public class Jukebox {
    public void musik (int Position){
        if (Position == 1){
            System.out.println("Пусть бегут неуклюже");
        }
        else if (Position == 2){
            System.out.println("Спокойной ночи");
        }
        else
            System.out.println("Песня не найдена");
    }
    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        petya.musik(1);
    }
}
