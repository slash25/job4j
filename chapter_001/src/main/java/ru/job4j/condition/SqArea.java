package ru.job4j.condition;
/**
//Необходимо вычислить площадь прямоугольника по заданным параметрам
//Периметр прямоугольника вычисляется по следующей формуле:
// p = 2 * (l+ h); где l - длинна, h - высота.
/*В задании известно, что ширина больше высоты в k раз.
 w = h * k;
В программе известны периметр прямоугольника и коэффициент K.
Нам нужно по этим параметрам вычислить длину и высоту прямоугольника.
а потом вычислить площадь полученного прямоугольника.

s = w * h;
 p = 2 * (l + h);
 l + h = p/2;
 l = p/2 - h;
 l = k * h;
 h = k * l;
 l = p/2 - k * l;
 l + k * l = p/2;
 l * (1 + k) =p/2;

 l = (p/2)/(1 + k) ;
 */

public class SqArea {
    /** l = Вычислим длину из выведенной формулы периметра
     *  h = Вычислим высоту
     * @param p perimetr
     * @param k koeficent
     * @return result
     */
    public static int square(int p, int k) {

        int l = (p / 2) / (1 + k);
        int h = k * l;
        return  l * h;
    }
    public static void main(String[] args) {
        int result1 = square(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
