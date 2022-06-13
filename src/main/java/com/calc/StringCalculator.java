package com.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (numbers.startsWith("//")) {
            return splitWithCustomDelimiter(numbers);
        }
        String[] convertToArray = numbers.split(",|\n");
        return convertToArray;
    }

    private static String[] splitWithCustomDelimiter(String numbers) {
        Pattern pattern = Pattern.compile("//(.)\n(.*)");
        Matcher matcher = pattern.matcher(numbers);
        matcher.matches();
        String delimiter = matcher.group(1);
        return matcher.group(2).split(delimiter);
    }

    private static int sum(String[] listOfNumbers) {
        int sum = 0;
        for (String number : listOfNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
