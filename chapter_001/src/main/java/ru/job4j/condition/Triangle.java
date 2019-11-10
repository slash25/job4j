package ru.job4j.condition;

import java.lang.reflect.Array;

public class Triangle {
    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public static double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
           return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return exist triangle
     */

    private boolean exist(double a, double b, double c) {
        return (a + c > b) && (c + b > a) && (b + a > c);
    }

    /** Метод проверяет можно ли построить треугольник  через вычисление площади
     *
     * @param x1 координаты первой точки по Х
     * @param y1 координаты первой точки по У
     * @param x2 координаты второй точки по Х
     * @param y2 координаты второй точки по У
     * @param x3 координаты третьей точки по Х
     * @param y3 координаты третьей  точки по У
     * @return  true or false
     */
    public static  boolean existing(int x1, int y1, int x2, int y2, int x3, int y3){
        return area(x1, y1, x2, y2, x3, y3) != -1;
    }
}
