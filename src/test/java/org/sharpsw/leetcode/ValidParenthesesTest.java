package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class ValidParenthesesTest {
    private ValidParentheses service;

    @BeforeEach
    void setUp() {
        service = new ValidParentheses();
    }

    @Test
    void shouldSupportEmptyInput() {
        assertThat(service.isValid(""), is(true));
    }

    @Test
    void shouldSupportParentheses() {
        assertThat(service.isValid("()"), is(true));
    }

    @Test
    void shouldSupportBrackets() {
        assertThat(service.isValid("[]"), is(true));
    }

    @Test
    void shouldSupportAngleBrackets() {
        assertThat(service.isValid("{}"), is(true));
    }

    @Test
    void shouldSupportMixedChars() {
        assertThat(service.isValid("{})"), is(false));
    }
}
