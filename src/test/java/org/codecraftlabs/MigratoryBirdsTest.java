package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.LinkedList;
import java.util.List;

class MigratoryBirdsTest {
    private MigratoryBirds sut;

    @BeforeEach
    void setUp() {
        sut = new MigratoryBirds();
    }

    @Test
    void testCase001() {
        List<Integer> items = new LinkedList<>();
        items.add(1);
        items.add(4);
        items.add(4);
        items.add(4);
        items.add(5);
        items.add(3);

        assertThat(sut.migratoryBirds(items), is(4));
    }

    @Test
    void testCase002() {
        List<Integer> items = new LinkedList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(4);
        items.add(3);
        items.add(2);
        items.add(1);
        items.add(3);
        items.add(4);

        assertThat(sut.migratoryBirds(items), is(3));
    }
}
