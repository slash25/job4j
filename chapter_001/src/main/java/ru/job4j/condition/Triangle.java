package ru.job4j.condition;

/**Треугольник может существовать, если сумма двух сторон больше третий
 * для всех комбинаций.
 Допустим у нас заданы три переменные: double ab, ac, bc - это длины сторон.
 Нужно проверить что: ab + ac > bc и ac + bc > ab и ab + bc > ac.
 Если условие выполняется то треугольник существует.
 *
 */
public class Triangle {
    /**
     *
     * @param ab firs side
     * @param ac second side
     * @param bc third side
     * @return value
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
