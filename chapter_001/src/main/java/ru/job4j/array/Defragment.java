package ru.job4j.array;
/*** Class for delete null values of string
 *
 */
public class Defragment {
    /**Counting summ of nulls
     *
     * @param  array our array
     * @return array
     */
    public static String[] compress(String[] array) {
        int countNull = 0;
        for (int index = 0; index < array.length - 1; index++) {
            String cell = array[index];
            if (cell == null) {
                countNull = countNull + 1;
            }
        }
            for (int index = 0; index < array.length - countNull; index++) {
                String cell = array[index];
                String nextCell = array[index + 1];
                if (cell == null) {
                    array[index] = nextCell;
                    String[] newArray = sdvig(array, index);
                    int ind = array.length - 1;
                    newArray[ind] = null;
                }
            }
        return array;
    }
    /**method for sdvig of array on one value  to left
     *
     * @param array array of string
     * @param j index
     * @return array
     */
    private static  String[] sdvig(String[] array, int j) {
        for (int count = j + 1; count < array.length - 1; count++) {
            String temp = array[count];
            array[count] = array[count + 1];
            array[count + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        //Упростили цикл:
        //for (int index = 0; index < compressed.length; index++) {
        //            System.out.print(compressed[index] + " ");} в следующий (ниже)

        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
