package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void squareTest() {
        int in1 = 4, in2 = 1;
        int exepted = 1;
        int out = SqArea.square(in1, in2);
        Assert.assertEquals(exepted, out);
    }
}
