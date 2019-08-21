package com.company;

public class Main {

    public static void main(String[] args) {

	    // Floating numbers have fractional parts that we express with a decimal point.
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min: " + minFloat);
        System.out.println("Float max: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double min: " + minDouble);
        System.out.println("Double max: " + maxDouble);

        int intValue = 5 / 3;

        // Floats aren't really recommended to use double is the preferred type.
//        float floatValue = (float) 5.25;
        float floatValue = 5f / 3f;
        double doubleValue = 5.00 / 3.00;

        System.out.println("Int value: " + intValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        double pounds = 200d;
        double kilo = pounds * 0.45359237d;
        System.out.println("pounds to kilos: " + kilo);

        double pi = 3.1415927d;
        double value = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(value);

        // When precise calculations are required Java has a class called BigDecimal you should use instead.

        // Char can only store a single character
        char newChar = 'D';
        char uniChar = '\u00a9';
        System.out.println(newChar);
        System.out.println(uniChar);

        // Boolean can only be set to true or false

        boolean bTrue = true;
        boolean bFalse = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
