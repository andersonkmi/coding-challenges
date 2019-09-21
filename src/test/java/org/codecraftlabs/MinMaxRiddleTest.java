package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxRiddleTest {
    private MinMaxRiddle service;

    @BeforeEach
    void setup() {
        service = new MinMaxRiddle();
    }

    @Test
    void testCase001() {
        long[] items = {6, 3, 5, 1, 12};
        long[] results = service.riddle(items);
    }
}
