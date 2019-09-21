package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;

class PhoneLetterCombinationsTest {
    private PhoneLetterCombinations service;

    @BeforeEach
    void setup() {
        service = new PhoneLetterCombinations();
    }

    @Test
    void testWithSimpleDigit() {
        assertThat(service.letterCombinations("2"), hasItems("a", "b", "c"));
    }

    @Test
    void testWithDigit1() {
        assertThat(service.letterCombinations("1").size(), is(0));
    }

    @Test
    void testWithTwoDigits() {
        assertThat(service.letterCombinations("23"), hasItems("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}
