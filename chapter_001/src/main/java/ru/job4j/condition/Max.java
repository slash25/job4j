package ru.job4j.condition;
/**Нужно сравнить два числа и  вернуть максимальное из них.
 *
 */
class Max {
    /**
     *
     * @param left value
     * @param right value
     * @return result
     */
    static int max(int left, int right) {
        return left > right ? left : right;
    }
}
