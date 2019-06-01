package org.codecraftlabs;

import org.codecraftlabs.DivisibleSumPairs;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


public class DivisibleSumPairsTest {
    private DivisibleSumPairs sut;

    @Before
    public void setUp() {
        sut = new DivisibleSumPairs();
    }

    @Test
    public void testNullArray() {
        assertThat(sut.divisibleSumPairs(0, 3, null), is(0));
    }

    @Test
    public void testEmptyArray() {
        int[] a = new int[1];
        assertThat(sut.divisibleSumPairs(0, 3, a), is(0));
    }

    @Test
    public void testSingleValueArray() {
        int[] ar = new int[1];
        ar[0] = 2;

        assertThat(sut.divisibleSumPairs(1, 3, ar), is(0));
    }

    @Test
    public void testCase001() {
        int[] ar = {2, 1};

        assertThat(sut.divisibleSumPairs(ar.length, 2, ar), is(0));
    }

    @Test
    public void testCase002() {
        int[] ar = {2, 1};

        assertThat(sut.divisibleSumPairs(ar.length, 3, ar), is(1));
    }

    @Test
    public void testCase003() {
        int[] ar = {1, 3, 2, 6, 1, 2};

        assertThat(sut.divisibleSumPairs(ar.length, 3, ar), is(5));
    }
}
