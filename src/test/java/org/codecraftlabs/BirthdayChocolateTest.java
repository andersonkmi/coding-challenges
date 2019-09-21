package org.codecraftlabs;

import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;


class BirthdayChocolateTest {
    private BirthdayChocolate sut;

    @BeforeEach
    void setup() {
        sut = new BirthdayChocolate();
    }

    @Test
    void testCase001() {
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
    void testCase002() {
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
    void testCase003() {
        List<Integer> slices = new LinkedList<>();
        slices.add(4);

        int result = sut.birthday(slices, 4, 1);
        assertThat(result, is(1));

    }
}
