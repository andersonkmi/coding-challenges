package org.sharpsw.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SingleNumberExerciseTest {
    private SingleNumberExercise classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new SingleNumberExercise();
    }

    @Test
    public void testCase001() {
        int[] numbers = {1, 2, 2, 3, 1, 3, 4, 5, 5};
        Assert.assertThat(classUnderTest.singleNumber(numbers), is(4));
    }
}
