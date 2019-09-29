package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class TwoCharactersTest {
    private TwoCharacters cut;

    @BeforeEach
    void setup() {
        cut = new TwoCharacters();
    }

    @Test
    void testCase001() {
        assertThat(cut.alternate("beabeefeab"), is(5));
    }
}
