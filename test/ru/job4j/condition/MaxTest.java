package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3From3() {
        int result = Max.max(2, 1,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5From4() {
        int result = Max.max(2, 5,3,3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10From4() {
        int result = Max.max(10, 10,3,3);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax15From4() {
        int result = Max.max(10, 10,3,15);
        assertThat(result, is(15));
    }
}
