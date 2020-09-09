package ru.job4j.collections;
import java.util.ArrayList;
import java.util.List;
public class ConvertList {

    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }

    public static List<String> convertStrings(List<String[]> list) {
        List<String> rs = new ArrayList<>();
        for (String[] row : list) {
            for (String cell : row) {
                rs.add(cell);
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        List<String[]> names = new ArrayList<>();
        names.add(new String[] {"Petr", "Arsentev"});
        for (String[] row : names) {
            for (String cell : row) {
                System.out.println(cell);
            }
        }
    }
}
