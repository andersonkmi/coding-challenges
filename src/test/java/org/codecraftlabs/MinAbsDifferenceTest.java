package org.codecraftlabs;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class MinAbsDifferenceTest {
    private MinAbsDifference cut;

    @BeforeEach
    void setup() {
        cut = new MinAbsDifference();
    }

    @Test
    void testCase001() {
        int[] arr = {-2, 2, 4};

        int diff = cut.minimumAbsoluteDifference(arr);
        assertThat(diff, CoreMatchers.is(2));
    }

    @Test
    void testCase002() {
        int[] arr = {3, -7, 0};

        int diff = cut.minimumAbsoluteDifference(arr);
        assertThat(diff, CoreMatchers.is(3));
    }

    @Test
    void testCase003() {
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};

        int diff = cut.minimumAbsoluteDifference(arr);
        assertThat(diff, CoreMatchers.is(1));
    }
}
