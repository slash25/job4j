package ru.job4j.io;
import java.util.Random;
import  java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String quest = input.nextLine();
        int answerRand = new Random().nextInt(3);
        System.out.println(answer(answerRand));
    }

    static String answer(int value) {
        String answer;
        switch (value) {
            case (0):
               answer = "Да!";
               break;
            case (1):
                answer = "Нет!";
                break;
            default:
                answer = "Может быть!";
        }
        return answer;
    }
}
