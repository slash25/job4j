package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRubl(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");

        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars");

        int euroToRubles = euroToRuble(50);
        System.out.println("50 euro are " + euroToRubles + " rubles");

        int dollarsToRubles = dollarToRubl(50);
        System.out.println("50 dollars are " + dollarsToRubles + " rubles");

        //Testing rubleToEuro
        int inRubToEur = 140; //Входные данные
        int expected = 2; //Ожидаемое значение
        int out1 =  rubleToEuro(inRubToEur); //Сценарий
        boolean passed = expected == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //Testing rubleToDollar

        int inRubToDol = 140; //Входные данные
        int expected1 = 2; //Ожидаемое значение
        int out2 =  rubleToDollar(inRubToDol);
        boolean passed1 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        //Testing EuroToRubles
        int inEurToRub = 50;
        int expected2 = 3500;
        int out3 = euroToRuble(inEurToRub);
        boolean passed2 = expected2 == out3;
        System.out.println("50 euro are 3500. Test result : " + passed2);


        //Testing DollarToRubles
        int inDolToRub = 50;
        int expected3 = 3000;
        int out4 = dollarToRubl(inDolToRub);
        boolean passed3 = expected3 == out4;
        System.out.println("50 dollars are 3000. Test result : " + passed3);
    }
}
