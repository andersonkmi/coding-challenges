package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ReverseIntegerTest {

    private ReverseInteger service;

    @Before
    public void setup() {
        service = new ReverseInteger();
    }

    @Test
    public void shouldRevertZero() {
        assertThat(service.reverse(0), is(0));
    }

    @Test
    public void shouldRevertSingleNumber() {
        assertThat(service.reverse(1), is(1));
    }

    @Test
    public void shouldRevert2DigitNumber() {
        assertThat(service.reverse(12), is(21));
    }

    @Test
    public void shouldRevert2DigitNumberZeroEnded() {
        assertThat(service.reverse(30), is(3));
    }

    @Test
    public void shouldRevertNeg2DigitNumberZeroEnded() {
        assertThat(service.reverse(-30), is(-3));
    }
}
