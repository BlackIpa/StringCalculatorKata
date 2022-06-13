package com.calc;

public class App
{
    public static void main( String[] args ) {

        System.out.println(StringCalculator.add(""));
        System.out.println(StringCalculator.add("1"));
        System.out.println(StringCalculator.add("1,2"));
        System.out.println(StringCalculator.add("1,2,3"));
        System.out.println(StringCalculator.add("1\n2,3"));
        System.out.println(StringCalculator.add("//;\n1;2"));
        System.out.println(StringCalculator.add("2,1000,1001"));
        System.out.println(StringCalculator.add("1,-2,-3,3"));
    }
}
