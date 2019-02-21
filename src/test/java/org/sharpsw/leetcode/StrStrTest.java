package org.sharpsw.leetcode;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StrStrTest {
    private StrStr service;

    @Before
    public void setUp() {
        service = new StrStr();
    }

    @Test
    public void shouldSupportEmptyInput() {
        assertThat(service.strStr("", ""), is(0));
    }
}
