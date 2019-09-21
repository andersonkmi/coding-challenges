package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class AlternatingCharsTest {
    private AlternatingChars cut;

    @BeforeEach
    void setup() {
        cut = new AlternatingChars();
    }

    @Test
    void testCase001() {
        String input = "AB";
        assertThat(cut.alternatingCharacters(input), is(0));
    }

    @Test
    void testCase002() {
        String input = "AAB";
        assertThat(cut.alternatingCharacters(input), is(1));
    }

    @Test
    void testCase003() {
        String input = "AAAA";
        assertThat(cut.alternatingCharacters(input), is(3));
    }

    @Test
    void testCase004() {
        String input = "AAABBB";
        assertThat(cut.alternatingCharacters(input), is(4));
    }
}
