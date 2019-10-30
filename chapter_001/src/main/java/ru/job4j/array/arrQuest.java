package ru.job4j.array;

/**Сравнить два массива: int[] arr1 и int[] arr2
 *и найти в них одинаковые элементы
 */
public class arrQuest {
    /**Сравним каждый элемент массива int[] arr1 с каждым элементом массива int[] arr2)
     * и если будут совпадения то запишем эти совпадения в массив int[] newArr
     * @param arr1 first array
     * @param arr2 second array
     * @return newArr
     */
    public static int[] Array(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr2.length];
        int i = 0;
        for (int var : arr1) {
            for (int var2 : arr2) {
                if (var == var2) {
                    newArr[i] = var;
                    i++;
                }
            }
        }
        return newArr;
    }
}


