package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNoExist() {
        boolean result = Triangle.exist(2.0, 2.0, 0.0);
        assertThat(result, is(false));
    }

    @Test
    public void AreaTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(10, 0);
        Triangle triangle = new Triangle(a,b,c);
        double expected = 25;
        Assert.assertEquals(expected, triangle.area(), 0.01);
    }
    @Test
    public void AreaFalse() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(10, 0);
        Triangle triangle = new Triangle(a,b,c);
        double expected = -1;
        Assert.assertEquals(expected, triangle.area(), 0.01);
    }
}