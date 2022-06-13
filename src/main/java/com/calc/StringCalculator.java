package com.calc;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        List<Integer> listOfNumbers = convertNumbersToList(numbers);
        return sum(listOfNumbers);
    }

    private static List<Integer> convertNumbersToList(String numbers) {
        String[] convertToArray = numbers.split(",");
        List<Integer> convertedToList = new ArrayList<Integer>();
        for (String number : convertToArray) {
            convertedToList.add(Integer.parseInt(number));
        }
        return convertedToList;
    }

    private static int sum(List<Integer> listOfNumbers) {
        int sum = 0;
        for (Integer number : listOfNumbers) {
            sum += number;
        }
        return sum;
    }

}
