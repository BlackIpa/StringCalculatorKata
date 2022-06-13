package com.calc;

import org.junit.*;
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
}