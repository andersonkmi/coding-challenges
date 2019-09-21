package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SingleNumberExerciseTest {
    private SingleNumberExercise classUnderTest;

    @BeforeEach
    void setUp() {
        classUnderTest = new SingleNumberExercise();
    }

    @Test
    void testCase001() {
        int[] numbers = {1, 2, 2, 3, 1, 3, 4, 5, 5};
        assertThat(classUnderTest.singleNumber(numbers), is(4));
    }
}
