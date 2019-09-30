package job4j.converter;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void euroToRuble() {
        int in = 50;
        int expected = 3500;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void dollarToRuble() {
        int in = 50;
        int expected = 3000;
        int out = Converter.dollarToRubl(in);
        Assert.assertEquals(expected, out);
    }
}
