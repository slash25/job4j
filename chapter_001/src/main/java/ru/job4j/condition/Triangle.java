package ru.job4j.condition;

import java.lang.reflect.Array;

public class Triangle {

    /**Поля объекта Triangle (координаты точек треугольника)
     *
     */
    public Point first;
    public Point second;
    public Point third;

    /** Конструктор объекта Triangle
     *
     * @param ap first values
     * @param bp second values
     * @param cp third values
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

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
    public double period(double a, double b, double c) {
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
    public  double area(double x1, double y1, double x2, double y2, double x3, double y3) {
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
}
