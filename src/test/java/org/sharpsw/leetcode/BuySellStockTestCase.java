package org.sharpsw.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BuySellStockTestCase {
    private BuySellStock service;

    @Before
    public void setup() {
        service = new BuySellStock();
    }

    @Test
    public void test001() {
        int[] prices = {2, 4, 1};
        assertThat(service.maxProfit(prices), is(2));
    }
}
