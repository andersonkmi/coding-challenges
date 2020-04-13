package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class BestDivisorTest {
    private BestDivisor cut;

    @BeforeEach
    void setup() {
        cut = new BestDivisor();
    }

    @Test
    public void testCase001() {
        assertThat(cut.getNumber(100000), is("625"));
    }
}
