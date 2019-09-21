package org.sharpsw.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcTest {
    private Calc calc = new Calc();

    @Test
    void shouldParseNumbers() throws Calc.MissingNumberException {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    void shouldParseFloats() throws Calc.MissingNumberException {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    void shouldSupportAddition() throws Calc.MissingNumberException {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    void shouldSupportMultiplication() throws Calc.MissingNumberException {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    void shouldSupportSubtraction() throws Calc.MissingNumberException {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    void shouldSupportDivision() throws Calc.MissingNumberException {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test
    void shouldCalculateOk() throws Calc.MissingNumberException {
        assertEquals(6, calc.evaluate("7 4 5 + * 3 - 10 /"), 0);
    }

    @Test
    void shouldCalculateAnotherExpr() throws Calc.MissingNumberException {
        // 3 2 1 - *
        assertEquals(3, calc.evaluate("3 2 1 - *"), 0);
    }

    @Test
    void shouldSupportEmptyExpr() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate(""), 0);
    }

    @Test
    void handleNullExpression() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate(null), 0);
    }

    @Test
    void handleExpressionWithMathOperationOnly() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate("+"), 0);
    }

    @Test
    void handleMissingNumbers() {
        assertThrows(Calc.MissingNumberException.class, () -> calc.evaluate("2 +"));
    }

    @Test
    void handleMissingOperator() {
        assertThrows(Calc.MissingNumberException.class, () -> calc.evaluate("2 2 3 +"));
    }
}
