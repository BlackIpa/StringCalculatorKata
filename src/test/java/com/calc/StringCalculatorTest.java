package com.calc;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void noDelimiterReturnsNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void withDelimiterReturnsSum() {
        assertEquals(3, StringCalculator.add("1,2"));
    }
}