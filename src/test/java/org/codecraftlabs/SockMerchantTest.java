package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class SockMerchantTest {
    private SockMerchant cut;

    @BeforeEach
    void setup() {
        cut = new SockMerchant();
    }

    @Test
    void testCase001() {
        assertThat(cut.sockMerchant(0, null), is(0));
    }

    @Test
    void testCase002() {
        int[] items = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assertThat(cut.sockMerchant(items.length, items), is(3));
    }

    @Test
    void testCase003() {
        int[] items = {1, 2, 3};

        assertThat(cut.sockMerchant(items.length, items), is(0));
    }

    @Test
    void testCase004() {
        int[] items = {1, 2, 3, 1};

        assertThat(cut.sockMerchant(items.length, items), is(1));
    }
}
