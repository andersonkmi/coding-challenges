package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LongestSubstringExerciseTest {
    private LongestSubstringExercise classUnderTest;

    @BeforeEach
    void setup() {
        classUnderTest = new LongestSubstringExercise();
    }

    @Test
    void testCase001() {
        assertThat(classUnderTest.lengthOfLongestSubstring("abca"), is(3));
    }

    @Test
    void testCase002() {
        assertThat(classUnderTest.lengthOfLongestSubstring("bbbbbbb"), is(1));
    }

    @Test
    void testCase003() {
        assertThat(classUnderTest.lengthOfLongestSubstring("aabcd"), is(4));
    }

    @Test
    void testCase004() {
        assertThat(classUnderTest.lengthOfLongestSubstring("pwwkew"), is(3));
    }

    @Test
    void testCase005() {
        assertThat(classUnderTest.lengthOfLongestSubstring("dvdf"), is(3));
    }
}
