package org.sharpsw.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void shouldParseNumbers() throws Calc.MissingNumberException {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() throws Calc.MissingNumberException {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() throws Calc.MissingNumberException {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() throws Calc.MissingNumberException {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubtraction() throws Calc.MissingNumberException {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() throws Calc.MissingNumberException {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test
    public void shouldCalculateOk() throws Calc.MissingNumberException {
        assertEquals(6, calc.evaluate("7 4 5 + * 3 - 10 /"), 0);
    }

    @Test
    public void shouldCalculateAnotherExpr() throws Calc.MissingNumberException {
        // 3 2 1 - *
        assertEquals(3, calc.evaluate("3 2 1 - *"), 0);
    }

    @Test
    public void shouldSupportEmptyExpr() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate(""), 0);
    }

    @Test
    public void handleNullExpression() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate(null), 0);
    }

    @Test
    public void handleExpressionWithMathOperationOnly() throws Calc.MissingNumberException {
        assertEquals(0, calc.evaluate("+"), 0);
    }

    @Test(expected = Calc.MissingNumberException.class)
    public void handleMissingNumbers() throws Calc.MissingNumberException {
        calc.evaluate("2 +");
    }

    @Test(expected = ArithmeticException.class)
    public void handleMissingOperator() throws Calc.MissingNumberException {
        calc.evaluate("2 2 3 +");
    }
}
