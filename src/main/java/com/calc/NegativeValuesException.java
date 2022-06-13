package com.calc;

import java.util.List;

public class NegativeValuesException extends RuntimeException {

    public NegativeValuesException(String message) {
        super(message);
    }

    public static void throwExceptionOnNegative(List<String> negativeNumbers) {
        if (negativeNumbers.size() > 0) {
            throw new NegativeValuesException("Negatives not allowed: " + negativeNumbers.toString());
        }
    }
}
