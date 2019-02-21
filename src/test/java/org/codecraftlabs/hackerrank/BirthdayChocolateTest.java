package org.codecraftlabs.hackerrank;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BirthdayChocolateTest {
    private BirthdayChocolate sut;

    @Before
    public void setup() {
        sut = new BirthdayChocolate();
    }

    @Test
    public void testCase001() {
        List<Integer> slices = new LinkedList<>();
        slices.add(1);
        slices.add(2);
        slices.add(1);
        slices.add(3);
        slices.add(2);

        int result = sut.birthday(slices, 3, 2);
        assertThat(result, is(2));
    }

    @Test
    public void testCase002() {
        List<Integer> slices = new LinkedList<>();
        slices.add(1);
        slices.add(1);
        slices.add(1);
        slices.add(1);
        slices.add(1);

        int result = sut.birthday(slices, 3, 2);
        assertThat(result, is(0));
    }

    @Test
    public void testCase003() {
        List<Integer> slices = new LinkedList<>();
        slices.add(4);

        int result = sut.birthday(slices, 4, 1);
        assertThat(result, is(1));

    }
}
