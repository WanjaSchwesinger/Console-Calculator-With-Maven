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


    //8 Tests for testee.summe(value1, value2);
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


    //8 Tests for testee.substraktion(value1, value2);
    @Test
    public void testSubstrTwoPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(25, 10) == 15);
    }

    @Test
    public void testSubstrTwoNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(-1, -2) == 1);
    }

    @Test
    public void testSubstrTwoZeroIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(0, 0) == 0);
    }

    @Test
    public void testSubstrZeroMinusPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(0, 2) == -2);
    }

    @Test
    public void testSubstrPositiveMinusZeroIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(9, 0) == 9);
    }

    @Test
    public void testSubstrZeroMinusNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(0, -2) == 2);
    }

    @Test
    public void testSubstrNegativeMinusZeroIsOk()  {
        testee = new Calculator();
        assertTrue(testee.substraktion(-2, 0) == -2);
    }

    @Test
    public void testSubstrPositiveMinusNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(4, -2) == 6);
    }

    //8 Tests for testee.division(value1, value2);
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

    @Test
    public void testDivisionTwoPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(2, 2) == 1);
    }

    @Test
    public void testDivisionTwoNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(-2, -2) == 1);
    }

    @Test
    public void testDivisionNegativeAndPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(-4, 2) == -2);
    }

    @Test
    public void testDivisionPositiveAndNegativeIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(8, -4) == -2);
    }

    @Test
    public void testDivisionMaxAndMinIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
    }


    @Test
    public void testDivisionZeroAndPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.division(0, 2) == 0);
    }

}