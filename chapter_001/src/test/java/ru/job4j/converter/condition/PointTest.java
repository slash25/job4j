package ru.job4j.converter.condition;
import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class PointTest {
    @Test
    public void Point3d() {
        Point a = new Point(1, 1,1);
        Point b = new Point(2, 2,2);
        double result = a.distance3d(b);
        assertThat(result, is(1.5537739740300374));
    }
    @Test
    public void Point3dv2() {
        Point a = new Point(5, 4,2);
        Point b = new Point(5, 4,0);
        double result = a.distance3d(b);
        assertThat(result, is(1.4142135623730951));
    }
    @Test
    public void Point3dv3() {
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 0,0);
        double result = a.distance3d(b);
        assertThat(result, is(0.0));
    }
}
