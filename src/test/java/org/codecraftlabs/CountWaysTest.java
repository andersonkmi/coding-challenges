package org.codecraftlabs;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountWaysTest {
    private CountWays cut;

    @Before
    public void setup() {
        cut = new CountWays();
    }

    @Test
    public void testOneStepLadder() {
        assertThat(cut.countWays(1, 3), is(1));
    }

    @Test
    public void testTwoStepLadder() {
        assertThat(cut.countWays(2, 3), is(2));
    }

    @Test
    public void test3StepLadder() {
        assertThat(cut.countWays(3, 3), is(4));
    }

    @Test
    public void test4StepLadder() {
        assertThat(cut.countWays(4, 4), is(8));
    }

}
