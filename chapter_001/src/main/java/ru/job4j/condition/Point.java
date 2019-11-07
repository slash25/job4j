package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**Найдем расстояние между точками в системе координат
 *
 */
public class Point {
    private int x;
    private int y;

    /**Создадим конструктор класса Point
     *
     * @param first x
     * @param second y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**Вычислим расстаяния между точками используя библиотеку Math
     * pow - степень
     * sqrt - квадратный корень
     * @param that (0,2)
     * @return distance
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(5, 4);
        Point b = new Point(2, 4);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
