package ru.job4j.Calculator;

public class Calculator {
    public static void add(int first, int second) {
        int result =  first + second;
        System.out.println(first + " + "  + second + " = " + result);
    }

    public static void main(String[] args) {
        add(1, 1);
        div(4,2);
        multiply(2,1);
        subtruck(10,5);
    }
    //Добавьте методы с именами div, multiply, subtrack.
    //1 + 1 = 2
    //4 / 2 = 2
    //2 * 1 = 2
    //10 - 5 = 5

    public static  void div(int first, int second){
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    public static  void multiply(int first, int second){
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    public static  void subtruck(int first, int second){
        int result = first - second;
        System.out.println(first + " * " + second + " = " + result);
    }
}
