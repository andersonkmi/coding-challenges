package org.sharpsw.leetcode;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("5###########0694", service.maskify("5512103073210694"));
    }

    @Test
    public void shouldNotMaskDigitsForShortCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("54321", service.maskify("54321"));
    }

    @Test
    public void shouldNotMaskDigitsForEmptyCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("", service.maskify(""));
    }

    @Test
    public void shouldMaskDigitsForFormattedCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("4###-####-####-5616", service.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskDigitsNonCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("Skippy", service.maskify("Skippy"));
    }
}
