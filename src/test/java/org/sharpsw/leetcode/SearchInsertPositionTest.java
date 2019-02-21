package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchInsertPositionTest {
    private SearchInsertPosition service;

    @Before
    public void setup() {
        service = new SearchInsertPosition();
    }

    @Test
    public void shouldSupportEmptyArray() {
        int[] numbers = {};

        assertThat(service.searchInsert(numbers, 0), is(0));
    }

    @Test
    public void testCase001() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 5), is(2));
    }

    @Test
    public void testCase002() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 2), is(1));
    }

    @Test
    public void testCase003() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 1), is(0));
    }

    @Test
    public void testCase004() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 7), is(4));
    }
}
