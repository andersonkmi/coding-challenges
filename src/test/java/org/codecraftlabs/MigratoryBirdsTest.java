package org.codecraftlabs;

import org.codecraftlabs.MigratoryBirds;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import java.util.LinkedList;
import java.util.List;

public class MigratoryBirdsTest {
    private MigratoryBirds sut;

    @Before
    public void setUp() {
        sut = new MigratoryBirds();
    }

    @Test
    public void testCase001() {
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
    public void testCase002() {
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
