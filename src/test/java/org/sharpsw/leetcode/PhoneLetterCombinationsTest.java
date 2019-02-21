package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class PhoneLetterCombinationsTest {
    private PhoneLetterCombinations service;

    @Before
    public void setup() {
        service = new PhoneLetterCombinations();
    }

    @Test
    public void testWithSimpleDigit() {
        assertThat(service.letterCombinations("2"), hasItems("a", "b", "c"));
    }

    @Test
    public void testWithDigit1() {
        assertThat(service.letterCombinations("1").size(), is(0));
    }

    @Test
    public void testWithTwoDigits() {
        assertThat(service.letterCombinations("23"), hasItems("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}
