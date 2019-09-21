package org.sharpsw.leetcode;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardTest {
    @Test
    void shouldMaskDigitsForBasicCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("5###########0694", service.maskify("5512103073210694"));
    }

    @Test
    void shouldNotMaskDigitsForShortCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("54321", service.maskify("54321"));
    }

    @Test
    void shouldNotMaskDigitsForEmptyCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("", service.maskify(""));
    }

    @Test
    void shouldMaskDigitsForFormattedCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("4###-####-####-5616", service.maskify("4556-3646-0793-5616"));
    }

    @Test
    void shouldNotMaskDigitsNonCreditCards() {
        CreditCard service = new CreditCard();
        assertEquals("Skippy", service.maskify("Skippy"));
    }
}
