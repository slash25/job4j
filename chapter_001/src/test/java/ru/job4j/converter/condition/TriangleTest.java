package ru.job4j.converter.condition;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    @Ignore
    public class TriangleTest {
        @Test
        public  void whenExist() {
            boolean result = Triangle.area(3.0, 2.0, 5.0, 4.0, 7.0, 5.0);
            assertThat(result, is(true));
        }
}
