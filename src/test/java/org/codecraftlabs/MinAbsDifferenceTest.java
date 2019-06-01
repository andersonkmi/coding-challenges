package org.codecraftlabs;

import org.codecraftlabs.MinAbsDifference;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinAbsDifferenceTest {
    private MinAbsDifference cut;

    @Before
    public void setup() {
        cut = new MinAbsDifference();
    }

    @Test
    public void testCase001() {
        int[] arr = {-2, 2, 4};

        int diff = cut.minimumAbsoluteDifference(arr);
        Assert.assertThat(diff, CoreMatchers.is(2));
    }

    @Test
    public void testCase002() {
        int[] arr = {3, -7, 0};

        int diff = cut.minimumAbsoluteDifference(arr);
        Assert.assertThat(diff, CoreMatchers.is(3));
    }

    @Test
    public void testCase003() {
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};

        int diff = cut.minimumAbsoluteDifference(arr);
        Assert.assertThat(diff, CoreMatchers.is(1));
    }
}
