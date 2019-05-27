package org.codecraftlabs.hackerrank;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AlternatingCharsTest {
    private AlternatingChars cut;

    @Before
    public void setup() {
        cut = new AlternatingChars();
    }

    @Test
    public void testCase001() {
        String input = "AB";
        assertThat(cut.alternatingCharacters(input), is(0));
    }

    @Test
    public void testCase002() {
        String input = "AAB";
        assertThat(cut.alternatingCharacters(input), is(1));
    }

    @Test
    public void testCase003() {
        String input = "AAAA";
        assertThat(cut.alternatingCharacters(input), is(3));
    }

    @Test
    public void testCase004() {
        String input = "AAABBB";
        assertThat(cut.alternatingCharacters(input), is(4));
    }
}
