package org.codecraftlabs.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NextGreaterElementTest {
    private NextGreaterElement nextGreaterElement;

    @BeforeEach
    public void setup() {
        nextGreaterElement = new NextGreaterElement();
    }

    @Test
    public void simpleTestCase() {
        int[] items = {1, 3, 2, 4};
        int[] expected = {3, 4, 4, -1};

        int[] result = nextGreaterElement.nextLargerElement(items);
        assertThat(result, is(expected));
    }
}
