package org.codecraftlabs;

import org.codecraftlabs.MaxSubarraySum;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;

public class MaxSubarraySumTest {
    private MaxSubarraySum cut;

    @Before
    public void setup() {
        cut = new MaxSubarraySum();
    }

    @Test
    public void emptyArrayTest() {
        List<Integer> results = new ArrayList<>();
        assertThat(cut.find(null, results), is(0));
        assertThat(results.size(),is(0));
    }

    @Test
    public void singleItemArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = {1};
        assertThat(cut.find(numbers, results), is(1));
        assertThat(results, hasItems(1));
    }

    @Test
    public void allNegativesArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = {-50, -1, -2, -3};
        assertThat(cut.find(numbers, results), is(-1));
        assertThat(results, hasItems(-1));
    }

    @Test
    public void regularArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        assertThat(cut.find(numbers, results), is(6));
        assertThat(results, hasItems(4, -1, 2, 1));
    }
}
