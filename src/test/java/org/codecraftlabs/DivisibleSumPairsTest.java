package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class DivisibleSumPairsTest {
    private DivisibleSumPairs sut;

    @BeforeEach
    void setUp() {
        sut = new DivisibleSumPairs();
    }

    @Test
    void testNullArray() {
        assertThat(sut.divisibleSumPairs(0, 3, null), is(0));
    }

    @Test
    void testEmptyArray() {
        int[] a = new int[1];
        assertThat(sut.divisibleSumPairs(0, 3, a), is(0));
    }

    @Test
    void testSingleValueArray() {
        int[] ar = new int[1];
        ar[0] = 2;

        assertThat(sut.divisibleSumPairs(1, 3, ar), is(0));
    }

    @Test
    void testCase001() {
        int[] ar = {2, 1};

        assertThat(sut.divisibleSumPairs(ar.length, 2, ar), is(0));
    }

    @Test
    void testCase002() {
        int[] ar = {2, 1};

        assertThat(sut.divisibleSumPairs(ar.length, 3, ar), is(1));
    }

    @Test
    void testCase003() {
        int[] ar = {1, 3, 2, 6, 1, 2};

        assertThat(sut.divisibleSumPairs(ar.length, 3, ar), is(5));
    }
}
