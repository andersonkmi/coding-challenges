package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class BuySellStockTestCase {
    private BuySellStock service;

    @BeforeEach
    void setup() {
        service = new BuySellStock();
    }

    @Test
    void test001() {
        int[] prices = {2, 4, 1};
        assertThat(service.maxProfit(prices), is(2));
    }
}
