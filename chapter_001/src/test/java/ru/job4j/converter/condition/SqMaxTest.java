package ru.job4j.converter.condition;

import org.junit.Test;
import ru.job4j.condition.SqMax;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(5, 45, 30, 5);
        assertThat(result, is(45));
    }
}
