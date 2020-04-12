package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(20, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        double expected = 20;
        Assert.assertEquals(expected, dist, 0.01);
    }
}
