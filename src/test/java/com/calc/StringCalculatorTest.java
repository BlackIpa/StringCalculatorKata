package com.calc;

import org.junit.*;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void returnsZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void returnsNumberWithoutDelimiter() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void ReturnsSumWithDelimiter() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void returnsSumOnMultipleNumbers() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void returnsSumWithNewLineDelimiter() {
        assertEquals(10, StringCalculator.add("1\n2,3\n4"));
    }

    @Test
    public void returnsSumWithCustomDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void throwExceptionOnOneNegativeNumber() {
        try{
            StringCalculator.add("1,-2,3");
            fail("Should throw exception");
        } catch (RuntimeException exception) {
            assertEquals("Negatives not allowed: [-2]", exception.getMessage());
        }
    }

    @Test
    public void throwExceptionOnMultipleNegativeNumber() {
        try{
            StringCalculator.add("1,-2,-3,3");
            fail("Should throw exception");
        } catch (RuntimeException exception) {
            assertEquals("Negatives not allowed: [-2, -3]", exception.getMessage());
        }
    }

    @Test
    public void returnResultWithoutNumbersAbove1000() {
        assertEquals(1002, StringCalculator.add("1000,2,1001"));
    }
}