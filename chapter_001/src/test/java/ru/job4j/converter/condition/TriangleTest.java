package ru.job4j.converter.condition;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    @Ignore
    public class TriangleTest {
        @Test
        public  void whenExist() {
            Point a  = new Point(2.0, 8.0);
            Point b = new Point(4.0, 5.0);
            Point c = new Point(10.0, 8.0);
            Triangle tr = new Triangle(a,b,c);
            double result = tr.area(2.0, 8.0, 4.0, 5.0, 10.0, 8.0 );
            assertThat(result, is(-1.0));
        }
}
