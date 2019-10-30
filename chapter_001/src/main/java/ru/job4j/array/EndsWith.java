package ru.job4j.array;
/**
 *
//проверить. что массив word имеет последние элементы одинаковые с post*/
public class EndsWith {
    /**Метод поиска и проверки  одинаковых элементов окончания массива
     *
     * @param word input array of chars
     * @param post we look this chars
     * @return
     *
     * /if (counter == post.length)
     * //abbreviated entry:
     *         //result = true
     *         result = counter == post.length;
     *         return result;
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result;
        int counter = 0;
        int postIndex = 0;

            for (int index = word.length - post.length; index < word.length; index++) {
                if (post[postIndex] == word[index]) {
                    counter++;
                }
            postIndex++;
        }
        result = counter == post.length;
        return result;
    }
}