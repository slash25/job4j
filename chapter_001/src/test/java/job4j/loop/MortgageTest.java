package job4j.loop;
import org.junit.Test;
import ru.job4j.loop.MortgageWithFor;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        MortgageWithFor mortgage = new MortgageWithFor();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        MortgageWithFor mortgage = new MortgageWithFor();
        int year = mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }
}
