package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;

        while (matches > 0) {
            System.out.println("Играет первый игрок");
            System.out.println("Возьмите пожалуйста спички в количестве от 1 до 3");
            int select = Integer.parseInt(input.nextLine());
            matches = matches - select;
            if (testMatches(matches)) {
                System.out.println("Выиграл первый игрок");
                break;
            }
            System.out.println("Осталось " + matches + " спичек");
            System.out.println("Играет второй игрок");
            System.out.println("Возьмите пожалуйста спички в количестве от 1 до 3");
            select = Integer.parseInt(input.nextLine());
            matches = matches - select;
            if (testMatches(matches)) {
                System.out.println("Выиграл второй игрок");
                break;
            }
            System.out.println("Осталось " + matches + " спичек");
        }
    }
    private static boolean testMatches(int matches) {
       /* if (matches <= 0) {
            return false;
        }*/
        return matches <= 0;
    }
}


