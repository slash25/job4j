package collections;

import java.util.List;

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0, index = 0;

        Integer[] lst = new Integer[list.size()];
        list.toArray(lst); // fill the array

        for (Integer num : list) {

            if (lst[index] == 1) {
                array[row][cell] = num;

            } else if ((lst[index] == 4) || (lst[index] == 7)) {
                row++;
                cell = 0;
                array[row][cell] = num;

            } else {
                cell++;
                array[row][cell] = num;

            }
            index++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
