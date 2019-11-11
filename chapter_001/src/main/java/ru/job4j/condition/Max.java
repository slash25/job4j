package ru.job4j.condition;

public class Max {
    private static int max(int left, int right) {
        return Math.max(left, right);
    }

    /**   //int tmp = max(right,left1);
         //return max(left, tmp);
     *
     * @param left first value
     * @param right second value
     * @param left1 third value
     * @return max
     */
    private static   int max(int left, int right, int left1){
         return max(left,max(right,left1));
    }
    public static int max(int left, int right, int left1, int right1){
        return max(left,max(right,left1,right1));
    }
}
