package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class PalindromeNumberTest {
    private PalindromeNumber service;

    @Before
    public void setup() {
        service = new PalindromeNumber();
    }

    @Test
    public void shouldHandleNegativeNumber() {
        assertThat(service.isPalindrome(-1), is(false));
    }

    @Test
    public void shouldHandlePositiveNumber() {
        assertThat(service.isPalindrome(1), is(true));
    }

    @Test
    public void shouldHandlePositiveNumberNotPalindrome() {
        assertThat(service.isPalindrome(10), is(false));
    }

    @Test
    public void shouldHandleValidPalindromeNumber() {
        assertThat(service.isPalindrome(121), is(true));
    }
}
