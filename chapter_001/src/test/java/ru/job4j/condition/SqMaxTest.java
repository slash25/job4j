package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void var1() {
        SqMax check = new SqMax();
        int result = SqMax.max(5, 45, 30, 5);
        assertThat(result, is(45));
    }
    @Test
    public void var2() {
        SqMax check = new SqMax();
        int result = SqMax.max(0, -45, 300, 5);
        assertThat(result, is(300));
    }
}
