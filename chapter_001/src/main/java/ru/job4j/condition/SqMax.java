package ru.job4j.condition;
/**Нужно найти максимум из четырех чисел
 */
class SqMax {
    static int max(int first, int second, int third, int forth) {
        int newresult1 = first > second ? first : second;
        int newresult2 = third > forth ? third : forth;
        return   newresult1 > newresult2 ? newresult1 : newresult2;

    }
}
