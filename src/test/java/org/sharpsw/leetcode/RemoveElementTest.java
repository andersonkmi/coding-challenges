package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveElementTest {
    private RemoveElement service;

    @Before
    public void setup() {
        service = new RemoveElement();
    }

    @Test
    public void shouldSupportSimpleCase() {
        int[] numbers = {3, 2, 2, 3};
        assertThat(service.removeElement(numbers, 3), is(2));
    }

    @Test
    public void shouldSupportEmptyArray() {
        int[] numbers = {};
        assertThat(service.removeElement(numbers, 3), is(0));
    }
}
