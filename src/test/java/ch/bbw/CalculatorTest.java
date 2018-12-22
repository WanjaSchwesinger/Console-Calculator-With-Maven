package ch.bbw;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 *
 * @author Wanja Schwesinger
 * @version 0.0.1
 */
public class CalculatorTest {

    Calculator testee;

    @Test
    public void testSumTwoPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSumTwoZerosIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(0, 0) == 0);
    }

    @Test
    public void testSumNegativePlusPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(-2, 4) == 2);
    }

    @Test
    public void testSumMaxIntegerAndNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(-2, Integer.MAX_VALUE) == Integer.MAX_VALUE - 2);
    }

    @Test
    public void testSumMinIntegerAndMaxIntegerIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(Integer.MIN_VALUE, Integer.MAX_VALUE) == -1);
    }

    @Test
    public void testSumZeroAndPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(0, 2) == 2);
    }

    @Test
    public void testSumZeroAndNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(0, -2) == -2);
    }

    @Test
    public void testSumTwoNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(-1, -2) == -3);
    }

    @Test
    public void testSubstrTwoPositiiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(25, 10) == 15);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividedByZeroException() {
        testee = new Calculator();
        testee.division(2, 0);
    }

    @Test
    public void testArithmeticExceptionNotRaised()
            throws IndexOutOfBoundsException {

        testee = new Calculator();
        testee.division(2, 2);
    }

}