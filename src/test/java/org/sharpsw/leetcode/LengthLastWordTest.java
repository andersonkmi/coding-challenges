package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LengthLastWordTest {
    private LengthLastWord cut;

    @BeforeEach
    public void setup() {
        cut = new LengthLastWord();
    }

    @Test
    public void shouldRaiseExceptionWithNullArgument() {
        assertThrows(IllegalArgumentException.class, () -> cut.lengthOfLastWord(null));
    }

    @Test
    public void shouldHandleEmptyString() {
        assertThat(cut.lengthOfLastWord(""), is(0));
    }
}
