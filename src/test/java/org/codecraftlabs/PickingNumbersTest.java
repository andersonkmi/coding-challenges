package org.codecraftlabs;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PickingNumbersTest {
    private PickingNumbers cut;

    @Before
    public void setup() {
        cut = new PickingNumbers();
    }

    @Test
    public void testCase() {
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
