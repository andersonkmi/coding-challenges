package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.hasItems;

class MaxSubarraySumTest {
    private MaxSubarraySum cut;

    @BeforeEach
    void setup() {
        cut = new MaxSubarraySum();
    }

    @Test
    void emptyArrayTest() {
        List<Integer> results = new ArrayList<>();
        assertThat(cut.find(null, results), is(0));
        assertThat(results.size(),is(0));
    }

    @Test
    void singleItemArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = {1};
        assertThat(cut.find(numbers, results), is(1));
        assertThat(results, hasItems(1));
    }

    @Test
    void allNegativesArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = {-50, -1, -2, -3};
        assertThat(cut.find(numbers, results), is(-1));
        assertThat(results, hasItems(-1));
    }

    @Test
    void regularArray() {
        List<Integer> results = new ArrayList<>();
        int[] numbers = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        assertThat(cut.find(numbers, results), is(6));
        assertThat(results, hasItems(4, -1, 2, 1));
    }
}
