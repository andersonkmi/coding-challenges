package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class ReverseIntegerTest {

    private ReverseInteger service;

    @BeforeEach
    void setup() {
        service = new ReverseInteger();
    }

    @Test
    void shouldRevertZero() {
        assertThat(service.reverse(0), is(0));
    }

    @Test
    void shouldRevertSingleNumber() {
        assertThat(service.reverse(1), is(1));
    }

    @Test
    void shouldRevert2DigitNumber() {
        assertThat(service.reverse(12), is(21));
    }

    @Test
    void shouldRevert2DigitNumberZeroEnded() {
        assertThat(service.reverse(30), is(3));
    }

    @Test
    void shouldRevertNeg2DigitNumberZeroEnded() {
        assertThat(service.reverse(-30), is(-3));
    }
}
