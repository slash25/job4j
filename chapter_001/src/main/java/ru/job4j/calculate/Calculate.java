package ru.job4j.calculate;
/** Class for calculate  arifmetic operation add, division, multiply, subtruck
 *@author Terekhov Bronislav
 * @since 8.09.219
 * @version 1
 */
public class Calculate {
    /**Create main metod and for metods mathematiks operation
     *
     * @param args different arguments for fours metods  "+"; "/"; "*"; "-"
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtruck(10, 5);
    }
    private static void add(int first, int second) {
        int result =  first + second;
        System.out.println(first + " + "  + second + " = " + result);
    }
    private static  void div(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    private static  void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    private static  void subtruck(int first, int second) {
        int result = first - second;
        System.out.println(first + " * " + second + " = " + result);
    }
}
