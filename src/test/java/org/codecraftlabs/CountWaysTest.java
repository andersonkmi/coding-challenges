package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class CountWaysTest {
    private CountWays cut;

    @BeforeEach
    void setup() {
        cut = new CountWays();
    }

    @Test
    void testOneStepLadder() {
        assertThat(cut.countWays(1, 3), is(1));
    }

    @Test
    void testTwoStepLadder() {
        assertThat(cut.countWays(2, 3), is(2));
    }

    @Test
    void test3StepLadder() {
        assertThat(cut.countWays(3, 3), is(4));
    }

    @Test
    void test4StepLadder() {
        assertThat(cut.countWays(4, 4), is(8));
    }
}
