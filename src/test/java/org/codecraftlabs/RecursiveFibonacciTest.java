package org.codecraftlabs;

import org.codecraftlabs.RecursiveFibonacci;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class RecursiveFibonacciTest {
    private RecursiveFibonacci cut;

    @Before
    public void setup() {
        cut = new RecursiveFibonacci();
    }

    @Test
    public void calculateFibonacciZero() {
        assertThat(cut.fibonacci(0), is(0L));
    }

    @Test
    public void calculateFibonacciOne() {
        assertThat(cut.fibonacci(1), is(1L));
    }

    @Test
    public void calculateFibonacciTest001() {
        assertThat(cut.fibonacci(3), is(2L));
    }

    @Test
    public void calculateFibonacciTest002() {
        assertThat(cut.fibonacci(4), is(3L));
    }

    @Test
    public void calculateFibonacciTest003() {
        assertThat(cut.fibonacci(30), is(832040L));
    }

    @Test
    public void calculateFibonacciTest004() {
        assertThat(cut.fibonacci(40), is(102334155L));
    }

    @Test
    public void calculateFibonacciTest005() {
        assertThat(cut.fibonacci(45), is(1134903170L));
    }
}
