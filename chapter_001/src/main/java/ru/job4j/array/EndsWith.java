package ru.job4j.array;

//проверить. что массив word имеет последние элементы одинаковые с post*/
public class EndsWith {
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
        //if (counter == post.length)
        //result = true
        result = counter == post.length;
        return result;
    }
}