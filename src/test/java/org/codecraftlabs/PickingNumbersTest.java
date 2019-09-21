package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PickingNumbersTest {
    private PickingNumbers cut;

    @BeforeEach
    void setup() {
        cut = new PickingNumbers();
    }

    @Test
    void testCase() {
        List<Integer> values = new ArrayList<>();

        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);
        values.add(66);

        assertThat(cut.pickingNumbers(values), is(10));
    }
}
