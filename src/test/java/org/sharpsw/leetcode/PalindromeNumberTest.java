package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PalindromeNumberTest {
    private PalindromeNumber service;

    @BeforeEach
    void setup() {
        service = new PalindromeNumber();
    }

    @Test
    void shouldHandleNegativeNumber() {
        assertThat(service.isPalindrome(-1), is(false));
    }

    @Test
    void shouldHandlePositiveNumber() {
        assertThat(service.isPalindrome(1), is(true));
    }

    @Test
    void shouldHandlePositiveNumberNotPalindrome() {
        assertThat(service.isPalindrome(10), is(false));
    }

    @Test
    void shouldHandleValidPalindromeNumber() {
        assertThat(service.isPalindrome(121), is(true));
    }
}
