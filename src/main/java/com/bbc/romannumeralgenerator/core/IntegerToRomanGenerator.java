package com.bbc.romannumeralgenerator.core;

public class IntegerToRomanGenerator implements RomanNumeralGenerator {

    public String generate(int number) {

        int repeatedTimes = 0;
        StringBuilder romanNumeral = new StringBuilder();
        int integerValues[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String romanSymbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        if (isValidRange(number)) {
            return "The range has to be between 1 to 3999.";
        }

        for (int x = 0; x < integerValues.length; x++) {
            repeatedTimes = number / integerValues[x];
            for (int i = 1; i <= repeatedTimes; i++) {
                romanNumeral.append(romanSymbols[x]);
            }
            number = number % integerValues[x];
        }
        return romanNumeral.toString();
    }

    private boolean isValidRange(int number) {
        if (number < 1 || number > 3999) {
            return true;
        }
        return false;
    }

}
