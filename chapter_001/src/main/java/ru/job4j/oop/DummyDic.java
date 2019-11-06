package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng){
       eng =  "Неизвестное слово " + eng;
       return  eng;
    }

    public static void main(String[] args) {
        DummyDic vokabulary = new DummyDic();
        String say = vokabulary.engToRus("word");
        System.out.println(say);
    }
}
