package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**AutoTest MaxTest class with different values
 *
 */
public class MaxTest {
    @Test
    public void var1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void var2() {
        int result = Max.max(10, 0);
        assertThat(result, is(10));
    }
    @Test
    public void var3() {
        int result = Max.max(-100, 2);
        assertThat(result, is(2));
    }
    @Test
    public void var4() {
        int result = Max.max(0, -50);
        assertThat(result, is(0));
    }
}
