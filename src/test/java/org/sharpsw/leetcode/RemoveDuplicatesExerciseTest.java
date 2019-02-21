package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesExerciseTest {

    private RemoveDuplicatesExercise cut;

    @Before
    public void setUp() {
        cut = new RemoveDuplicatesExercise();
    }

    @Test
    public void testCase001() {
        int[] nums = {1, 1, 2};
        assertThat(cut.removeDuplicates(nums), is(2));
    }

    @Test
    public void testCase002() {
        int[] nums = {1, 1, 2, 3, 3, 4};
        assertThat(cut.removeDuplicates(nums), is(4));
    }
}
