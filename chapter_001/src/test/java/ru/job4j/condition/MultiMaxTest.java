package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**АвтоТест класса MultiMaxTest поиск максимума из трех чисел
 *
 */
public class MultiMaxTest {
    @Test
    public void variant1() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 20, 2);
        assertThat(result, is(20));
    }
    @Test
    public void variant2() {
        MultiMax check = new MultiMax();
        int result = check.max(0, -20, 10);
        assertThat(result, is(10));
    }
}
