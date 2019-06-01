package org.codecraftlabs;

import org.codecraftlabs.SockMerchant;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SockMerchantTest {
    private SockMerchant cut;

    @Before
    public void setup() {
        cut = new SockMerchant();
    }

    @Test
    public void testCase001() {
        assertThat(cut.sockMerchant(0, null), is(0));
    }

    @Test
    public void testCase002() {
        int[] items = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assertThat(cut.sockMerchant(items.length, items), is(3));
    }

    @Test
    public void testCase003() {
        int[] items = {1, 2, 3};

        assertThat(cut.sockMerchant(items.length, items), is(0));
    }

    @Test
    public void testCase004() {
        int[] items = {1, 2, 3, 1};

        assertThat(cut.sockMerchant(items.length, items), is(1));
    }
}
