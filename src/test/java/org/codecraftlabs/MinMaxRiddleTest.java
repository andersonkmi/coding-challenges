package org.codecraftlabs;

import org.codecraftlabs.MinMaxRiddle;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class MinMaxRiddleTest {
    private MinMaxRiddle service;

    @Before
    public void setup() {
        service = new MinMaxRiddle();
    }

    @Test
    public void testCase001() {
        long[] items = {6, 3, 5, 1, 12};
        long[] results = service.riddle(items);
    }
}
