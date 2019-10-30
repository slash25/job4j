package ru.job4j.array;
/**Сравнить элементы в массиве boolean[] input друг с другом
 */

class Check {
    /**Сравниваем элементы по очереди с первым, если нашли разницу то фолс и брейк
     *
     * @param data input array
     * @return result
     */
    boolean mono(boolean[] data) {
        boolean firsElement = data[0];
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != firsElement) {
                result = false;
                break;
            }
        }
        return result;
    }
}

