package org.sharpsw.codility;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class SixLeastDigitsFibonacciTest {
    private SixLeastDigitsFibonacci service;

    @BeforeEach
    void setup() {
        service = new SixLeastDigitsFibonacci();
    }

    @Test
    public void testCase001() {
        assertThat(service.solution(8), is(21));
    }

    @Test
    public void testCase002() {
        assertThat(service.solution(36), is(930352));
    }
}
