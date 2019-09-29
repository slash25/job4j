package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        //Counting value of nulls
        int countNull = 0;
        for (int index = 0; index < array.length-1; index++) {
            String cell = array[index];
            if (cell == null) {
                countNull = countNull + 1;
            }
        }
            for (int index = 0; index < array.length - countNull; index ++){
                String cell = array[index];
                String nextCell = array[index + 1];
                if (cell == null){
                    array[index] = nextCell;
                    String[] newArray = sdvig(array,index);
                    //writing in end of array null
                    int ind = array.length - 1;
                    newArray[ind] = null;
                }
            }
        return array;
    }

    private static  String[] sdvig(String[] array, int j ){//method sdviga areya na 1 to left
        for (int count = j + 1;count < array.length - 1; count++ ){
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
