package ru.job4j.ex;

public class FindEl {
    public static int indexof(String[] value, String key) throws ElementNotFoundException {
        int rsl;
        int i = 0;
        for (String s : value) {
                if (s.equals(key)) {
                    rsl = i;
                    return rsl;
                }
                i++;
            }
         throw new ElementNotFoundException("key could not be found");
    }

    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "kat";
        arr[1] = "dog";
        arr[2] = "man";
        try {
            System.out.println(indexof(arr, "man"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
