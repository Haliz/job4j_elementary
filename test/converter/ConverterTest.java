package converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    /**
     * Для Евро
     */
    public void ruToEuro() {
        int in = 140;
        int expected = 2;
        int out = ru.job4j.converter.Converter.ruToEu(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    /**
     * Рубли из евро
     */
    public void euToRU() {
        int in = 2;
        int expected = 140;
        int out = ru.job4j.converter.Converter.euToRU(in);
        Assert.assertEquals(expected, out);
    }

    @Test
        /**
         * Для Бакса
         */
    public void ruToDollar() {
        int in = 180;
        int expected = 3;
        int out = ru.job4j.converter.Converter.ruToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
        /**
         * Рубли из бакса
         */
    public void dollarToRu() {
        int in = 5;
        int expected = 300;
        int out = ru.job4j.converter.Converter.dollarToRu(in);
        Assert.assertEquals(expected, out);
    }
}
