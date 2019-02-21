package org.sharpsw.codility;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class SixLeastDigitsFibonacciTest {
    private SixLeastDigitsFibonacci service;

    @Before
    public void setup() {
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
