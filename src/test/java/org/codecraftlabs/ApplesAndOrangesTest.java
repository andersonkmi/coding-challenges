package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class ApplesAndOrangesTest {
    private ApplesAndOranges sut;

    @BeforeEach
    void setup() {
        sut = new ApplesAndOranges();
    }

    @Test
    void testCase001() {
        int[] apples = {2, 3, -4};
        int [] oranges = {3, -2, -4};

        int[] results = sut.countApplesAndOranges(7, 10, 4, 12, apples, oranges);
        assertThat(results[0], is(1));
        assertThat(results[1], is(2));
    }
}
