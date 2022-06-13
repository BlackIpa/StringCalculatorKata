package com.calc;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        else {
            String[] listOfNumbers = convertNumbersToArray(numbers);
            return sum(listOfNumbers);
        }
    }

    private static String[] convertNumbersToArray(String numbers) {
        String[] convertToArray = numbers.split(",|\n");
        return convertToArray;
    }

    private static int sum(String[] listOfNumbers) {
        int sum = 0;
        for (String number : listOfNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
