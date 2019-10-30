package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**Тестовый класс для поиска в массиве char[] word одинаковых элементов
 *   if (pref[index] == word[index]) { так мы проверяем совпадение
 *
 *  if (pref[index] != word[index]) { так мы проверяем разницу
 *
 *  если это условие выполнилось то резулт фолс и брейк
 */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefix() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.charArray(word, pref);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotStartWithPrefix() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.charArray(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotStartWithPrefix1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i', 'l'};
        boolean result = ArrayChar.charArray(word, pref);
        assertThat(result, is(false));
    }
}
