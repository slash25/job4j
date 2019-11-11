package ru.job4j.converter.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxLast() {
        int result = Max.max(1, 2,3,5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax1first() {
        int result = Max.max(10,0, 2,5);
        assertThat(result, is(10));
    }
}
