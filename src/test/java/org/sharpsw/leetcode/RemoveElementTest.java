package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class RemoveElementTest {
    private RemoveElement service;

    @BeforeEach
    void setup() {
        service = new RemoveElement();
    }

    @Test
    void shouldSupportSimpleCase() {
        int[] numbers = {3, 2, 2, 3};
        assertThat(service.removeElement(numbers, 3), is(2));
    }

    @Test
    void shouldSupportEmptyArray() {
        int[] numbers = {};
        assertThat(service.removeElement(numbers, 3), is(0));
    }
}
