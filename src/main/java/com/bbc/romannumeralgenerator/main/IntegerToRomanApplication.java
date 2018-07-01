package com.bbc.romannumeralgenerator.main;

import com.bbc.romannumeralgenerator.core.IntegerToRomanGenerator;
import com.bbc.romannumeralgenerator.core.RomanNumeralGenerator;

public class IntegerToRomanApplication {

    public static void main(String args[]) {
        RomanNumeralGenerator romanConvertor = new IntegerToRomanGenerator();
        System.out.println("Converting the following integer to roman numeral");
        System.out.println("1: " + romanConvertor.generate(1));
        System.out.println("5: " + romanConvertor.generate(5));
        System.out.println("10: " + romanConvertor.generate(10));
        System.out.println("20: " + romanConvertor.generate(20));
        System.out.println("3999: " + romanConvertor.generate(3999));
    }

}
