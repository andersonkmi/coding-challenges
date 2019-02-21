package org.sharpsw.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberToOrdinalTest {
    @Test
    public void shouldHandleZeroValue() {
        NumberToOrdinal service = new NumberToOrdinal();
        assertEquals("0", service.numberToOrdinal(0));
    }

    @Test
    public void shouldHandleSingleDigits() {
        NumberToOrdinal service = new NumberToOrdinal();

        assertEquals("1st", service.numberToOrdinal(1));
        assertEquals("2nd", service.numberToOrdinal(2));
        assertEquals("3rd", service.numberToOrdinal(3));
        assertEquals("4th", service.numberToOrdinal(4));
        assertEquals("5th", service.numberToOrdinal(5));
        assertEquals("6th", service.numberToOrdinal(6));
        assertEquals("7th", service.numberToOrdinal(7));
        assertEquals("8th", service.numberToOrdinal(8));
        assertEquals("9th", service.numberToOrdinal(9));
    }

    @Test
    public void shouldHandleDoubleDigits() {
        NumberToOrdinal service = new NumberToOrdinal();

        assertEquals("11th", service.numberToOrdinal(11));
        assertEquals("12th", service.numberToOrdinal(12));
        assertEquals("13th", service.numberToOrdinal(13));
        assertEquals("14th", service.numberToOrdinal(14));
        assertEquals("15th", service.numberToOrdinal(15));
        assertEquals("16th", service.numberToOrdinal(16));
        assertEquals("17th", service.numberToOrdinal(17));
        assertEquals("18th", service.numberToOrdinal(18));
        assertEquals("19th", service.numberToOrdinal(19));
        assertEquals("22nd", service.numberToOrdinal(22));
        assertEquals("33rd", service.numberToOrdinal(33));
        assertEquals("44th", service.numberToOrdinal(44));
        assertEquals("55th", service.numberToOrdinal(55));
        assertEquals("66th", service.numberToOrdinal(66));
        assertEquals("77th", service.numberToOrdinal(77));
        assertEquals("88th", service.numberToOrdinal(88));
        assertEquals("99th", service.numberToOrdinal(99));
    }

    @Test
    public void shouldHandleTripleDigits() {
        NumberToOrdinal service = new NumberToOrdinal();

        assertEquals("111th", service.numberToOrdinal(111));
        assertEquals("222nd", service.numberToOrdinal(222));
        assertEquals("333rd", service.numberToOrdinal(333));
        assertEquals("444th", service.numberToOrdinal(444));
        assertEquals("555th", service.numberToOrdinal(555));
        assertEquals("666th", service.numberToOrdinal(666));
        assertEquals("777th", service.numberToOrdinal(777));
        assertEquals("888th", service.numberToOrdinal(888));
        assertEquals("999th", service.numberToOrdinal(999));
    }



    @Test
    public void shouldHandleZeroFinishedNumbers() {
        NumberToOrdinal service = new NumberToOrdinal();
        
        assertEquals("10th", service.numberToOrdinal(10));
        assertEquals("20th", service.numberToOrdinal(20));
        assertEquals("30th", service.numberToOrdinal(30));
        assertEquals("40th", service.numberToOrdinal(40));
        assertEquals("50th", service.numberToOrdinal(50));
        assertEquals("60th", service.numberToOrdinal(60));
        assertEquals("70th", service.numberToOrdinal(70));
        assertEquals("80th", service.numberToOrdinal(80));
        assertEquals("90th", service.numberToOrdinal(90));

        assertEquals("100th", service.numberToOrdinal(100));
        assertEquals("200th", service.numberToOrdinal(200));
        assertEquals("300th", service.numberToOrdinal(300));
        assertEquals("400th", service.numberToOrdinal(400));
        assertEquals("500th", service.numberToOrdinal(500));
        assertEquals("600th", service.numberToOrdinal(600));
        assertEquals("700th", service.numberToOrdinal(700));
        assertEquals("800th", service.numberToOrdinal(800));
        assertEquals("900th", service.numberToOrdinal(900));

        assertEquals("1000th", service.numberToOrdinal(1000));
        assertEquals("2000th", service.numberToOrdinal(2000));
        assertEquals("3000th", service.numberToOrdinal(3000));
        assertEquals("4000th", service.numberToOrdinal(4000));
        assertEquals("5000th", service.numberToOrdinal(5000));
        assertEquals("6000th", service.numberToOrdinal(6000));
        assertEquals("7000th", service.numberToOrdinal(7000));
        assertEquals("8000th", service.numberToOrdinal(8000));
        assertEquals("9000th", service.numberToOrdinal(9000));

    }
}
