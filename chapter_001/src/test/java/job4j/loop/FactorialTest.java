package job4j.loop;
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factor = new Factorial();
        int result = factor.calc(5);
        assertThat(result, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factor = new Factorial();
        int result = factor.calc(0);
        assertThat(result, is(1));
    }
}
