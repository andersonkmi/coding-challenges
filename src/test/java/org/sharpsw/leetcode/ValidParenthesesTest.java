package org.sharpsw.leetcode;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ValidParenthesesTest {
    private ValidParentheses service;

    @Before
    public void setUp() {
        service = new ValidParentheses();
    }

    @Test
    public void shouldSupportEmptyInput() {
        assertThat(service.isValid(""), is(true));
    }

    @Test
    public void shouldSupportParentheses() {
        assertThat(service.isValid("()"), is(true));
    }

    @Test
    public void shouldSupportBrackets() {
        assertThat(service.isValid("[]"), is(true));
    }

    @Test
    public void shouldSupportAngleBrackets() {
        assertThat(service.isValid("{}"), is(true));
    }

    @Test
    public void shouldSupportMixedChars() {
        assertThat(service.isValid("{})"), is(false));
    }
}
