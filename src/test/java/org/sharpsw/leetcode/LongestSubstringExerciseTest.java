package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestSubstringExerciseTest {
    private LongestSubstringExercise classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new LongestSubstringExercise();
    }

    @Test
    public void testCase001() {
        assertThat(classUnderTest.lengthOfLongestSubstring("abca"), is(3));
    }

    @Test
    public void testCase002() {
        assertThat(classUnderTest.lengthOfLongestSubstring("bbbbbbb"), is(1));
    }

    @Test
    public void testCase003() {
        assertThat(classUnderTest.lengthOfLongestSubstring("aabcd"), is(4));
    }

    @Test
    public void testCase004() {
        assertThat(classUnderTest.lengthOfLongestSubstring("pwwkew"), is(3));
    }

    @Test
    public void testCase005() {
        assertThat(classUnderTest.lengthOfLongestSubstring("dvdf"), is(3));
    }
}
