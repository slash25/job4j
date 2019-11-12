package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**Найдем расстояние между точками в системе координат
 *
 */
public class Point {
    private double x;
    private double y;
    private double z;

    /**Создадим конструктор класса Point для двух точек
     *
     * @param first x
     * @param second y
     */
    public Point(double first, double second) {
        this.x = first;
        this.y = second;
    }

    /**Создадим конструктор класса Point для трех точек
     *
     * @param first x
     * @param second y
     * @param third z
     */
    public Point(double first, double second, double third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**Вычислим расстаяния между точками используя библиотеку Math
     * pow - степень
     * sqrt - квадратный корень
     * @param that (0,2)
     * @return distance
     */

    public double distance(Point that) {
        return sqrt(pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    /*public static void main(String[] args) {
        Point a = new Point(5, 4);
        Point b = new Point(2, 4);
        double dist = a.distance(b);
        double dist3d =
        System.out.println(dist);
    }*/
    public double distance3d(Point that){
        return sqrt(pow(this.x - that.x, 2) + distance(that));
    }
}
