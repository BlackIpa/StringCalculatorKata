package com.calc;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        else if (!numbers.contains(",")){
            return Integer.parseInt(numbers);
        }
        else {
            String[] numberList = numbers.split(",");
            return Integer.parseInt(numberList[0]) + Integer.parseInt(numberList[1]);
        }
    }

}
