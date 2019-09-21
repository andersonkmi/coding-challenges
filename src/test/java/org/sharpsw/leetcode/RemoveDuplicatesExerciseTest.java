package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RemoveDuplicatesExerciseTest {

    private RemoveDuplicatesExercise cut;

    @BeforeEach
    void setUp() {
        cut = new RemoveDuplicatesExercise();
    }

    @Test
    void testCase001() {
        int[] nums = {1, 1, 2};
        assertThat(cut.removeDuplicates(nums), is(2));
    }

    @Test
    void testCase002() {
        int[] nums = {1, 1, 2, 3, 3, 4};
        assertThat(cut.removeDuplicates(nums), is(4));
    }
}
