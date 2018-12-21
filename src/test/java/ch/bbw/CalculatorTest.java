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
    public void testSubstrTwoPositiiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.substraktion(25, 10) == 15);
    }

}