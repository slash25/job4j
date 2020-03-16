package ru.job4j.ex;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFactLessOne() {
        int fact = Fact.calc(-1);
        assertThat(fact, is(5));
    }
}
