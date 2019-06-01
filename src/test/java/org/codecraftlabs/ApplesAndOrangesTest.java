package org.codecraftlabs;

import org.codecraftlabs.ApplesAndOranges;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ApplesAndOrangesTest {
    private ApplesAndOranges sut;

    @Before
    public void setup() {
        sut = new ApplesAndOranges();
    }

    @Test
    public void testCase001() {
        int[] apples = {2, 3, -4};
        int [] oranges = {3, -2, -4};

        int[] results = sut.countApplesAndOranges(7, 10, 4, 12, apples, oranges);
        assertThat(results[0], is(1));
        assertThat(results[1], is(2));
    }
}
