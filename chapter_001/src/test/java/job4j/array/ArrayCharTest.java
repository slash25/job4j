package job4j.array;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i', 'l'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(false));
    }
}
