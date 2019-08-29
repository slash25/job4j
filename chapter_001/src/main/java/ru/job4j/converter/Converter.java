package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        return value / 70;
    }
    public static int rubleToDollar(int value){
        return value / 60;
    }
    public static int euroToRuble(int value){
        return value * 70;
    }
    public static int dollarToRubl(int value){
        return value * 60;
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");

        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars");

        int EuroToRubles = euroToRuble(50);
        System.out.println("50 euro are " + EuroToRubles + " rubles" );

        int DollarsToRubles = dollarToRubl(50);
        System.out.println("50 dollars are " + DollarsToRubles + " rubles");

        //Testing rubleToEuro
        int in_RubToEur = 140;//Входные данные
        int expected = 2;//Ожидаемое значение
        int out1 =  rubleToEuro(in_RubToEur);//Сценарий
        boolean passed = expected == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //Testing rubleToDollar

        int in_RubToDol = 140;//Входные данные
        int expected1 = 2;//Ожидаемое значение
        int out2 =  rubleToDollar(in_RubToDol);
        boolean passed1 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        //Testing EuroToRubles
        int in_EurToRub = 50;
        int expected2 = 3500;
        int out3 = euroToRuble(in_EurToRub);
        boolean passed2 = expected2 == out3;
        System.out.println("50 euro are 3500. Test result : " + passed2);


        //Testing DollarToRubles
        int in_DolToRub = 50;
        int expected3 = 3000;
        int out4 = dollarToRubl(in_DolToRub);
        boolean passed3 = expected3 == out4;
        System.out.println("50 dollars are 3000. Test result : " + passed3);
    }
}
