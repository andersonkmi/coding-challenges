package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StrStrTest {
    private StrStr service;

    @BeforeEach
    void setUp() {
        service = new StrStr();
    }

    @Test
    void shouldSupportEmptyInput() {
        assertThat(service.strStr("", ""), is(0));
    }
}
