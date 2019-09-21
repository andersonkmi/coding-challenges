package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SearchInsertPositionTest {
    private SearchInsertPosition service;

    @BeforeEach
    void setup() {
        service = new SearchInsertPosition();
    }

    @Test
    void shouldSupportEmptyArray() {
        int[] numbers = {};

        assertThat(service.searchInsert(numbers, 0), is(0));
    }

    @Test
    void testCase001() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 5), is(2));
    }

    @Test
    void testCase002() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 2), is(1));
    }

    @Test
    void testCase003() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 1), is(0));
    }

    @Test
    void testCase004() {
        int[] numbers = {1, 3, 5, 6};
        assertThat(service.searchInsert(numbers, 7), is(4));
    }
}
