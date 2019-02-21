package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LengthLastWordTest {
    private LengthLastWord cut;

    @Before
    public void setup() {
        cut = new LengthLastWord();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldRaiseExceptionWithNullArgument() {
        cut.lengthOfLastWord(null);
    }

    @Test
    public void shouldHandleEmptyString() {
        assertThat(cut.lengthOfLastWord(""), is(0));
    }
}
