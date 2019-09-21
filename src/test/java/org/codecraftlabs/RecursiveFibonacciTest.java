package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class RecursiveFibonacciTest {
    private RecursiveFibonacci cut;

    @BeforeEach
    void setup() {
        cut = new RecursiveFibonacci();
    }

    @Test
    void calculateFibonacciZero() {
        assertThat(cut.fibonacci(0), is(0L));
    }

    @Test
    void calculateFibonacciOne() {
        assertThat(cut.fibonacci(1), is(1L));
    }

    @Test
    void calculateFibonacciTest001() {
        assertThat(cut.fibonacci(3), is(2L));
    }

    @Test
    void calculateFibonacciTest002() {
        assertThat(cut.fibonacci(4), is(3L));
    }

    @Test
    void calculateFibonacciTest003() {
        assertThat(cut.fibonacci(30), is(832040L));
    }

    @Test
    void calculateFibonacciTest004() {
        assertThat(cut.fibonacci(40), is(102334155L));
    }

    @Test
    void calculateFibonacciTest005() {
        assertThat(cut.fibonacci(45), is(1134903170L));
    }
}
