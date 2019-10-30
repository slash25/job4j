package ru.job4j.condition;
/**Сравнить три числа и найти максимальное число из них
 *
 */
class MultiMax {
    /**Метод  возвращает максимум из трех чисел.
     *Вначале найдем максимум между первым и вторым чисом
     * Потом полученный максимум сравним с третьим числом
     *
     * @param first first input value
     * @param second second input value
     * @param third third input value
     * @return result
     */
    int max(int first, int second, int third) {
        int newresult = first > second ? first : second;
        return newresult > third ? newresult : third;
    }
}
