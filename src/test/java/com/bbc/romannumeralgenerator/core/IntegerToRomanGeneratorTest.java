package com.bbc.romannumeralgenerator.core;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanGeneratorTest {
    private static RomanNumeralGenerator intToRom;
    private final String expectedErrorMessage = "The range has to be between 1 to 3999.";

    @BeforeClass
    public static void setup() {
        intToRom = new IntegerToRomanGenerator();
    }

    @Test
    public void assertErrorMessageIsGivenWithTooBigNumber() {
        String romanNumeral = intToRom.generate(4000);
        assertEquals(expectedErrorMessage, romanNumeral);
    }

    @Test
    public void assertErrorMessageIsGivenWithNegativeNumber() {
        String romanNumeral = intToRom.generate(-1);
        assertEquals(expectedErrorMessage, romanNumeral);
    }

    @Test
    public void assertErrorMessageIsGivenWhenConvertingZero() {
        String romanNumeral = intToRom.generate(0);
        assertEquals(expectedErrorMessage, romanNumeral);
    }

    @Test
    public void assertConvertingNumberThreeNineNineNine() {
        String romanNumeral = intToRom.generate(3999);
        assertEquals("MMMCMXCIX", romanNumeral);
    }

    @Test
    public void assertConvertingNumberTwenty() {
        String romanNumeral = intToRom.generate(20);
        assertEquals("XX", romanNumeral);
    }

    @Test
    public void assertConvertingNumberTen() {
        String romanNumeral = intToRom.generate(10);
        assertEquals("X", romanNumeral);
    }

    @Test
    public void assertConvertingNumberFive() {
        String romanNumeral = intToRom.generate(5);
        assertEquals("V", romanNumeral);
    }

    @Test
    public void assertConvertingNumberOne() {
        String romanNumeral = intToRom.generate(1);
        assertEquals("I", romanNumeral);
    }

    @Test
    public void assertConvertingNumberTwoZeroOneEight() {
        String romanNumeral = intToRom.generate(2018);
        assertEquals("MMXVIII", romanNumeral);
    }

}
