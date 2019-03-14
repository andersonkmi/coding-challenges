package org.codecraftlabs.hackerrank;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
