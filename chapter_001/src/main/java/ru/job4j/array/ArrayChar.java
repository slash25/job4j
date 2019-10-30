package ru.job4j.array;

/**Нужно найти в массиве char одинаковые элементы
 *
 */

class ArrayChar {
    /**Создадим метод для поиска одинаковых элементов в массиве char[] word
     * @param word входной массив
     * @param pref элементы которые должны повторяться
     * @return result
     */
    static boolean charArray(char[] word, char[] pref) {
        boolean result = true;
        int counter = 0;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
