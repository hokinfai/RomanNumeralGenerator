This project is to convert integer to Roman numeral symbols.

Approach to solution:
To solve this problem, we need to understand some basic concepts.

There are totally 7 symbols in Roman numerals - I(1)   V(5)   X(10)   L(50)   C(100)   D(500)   M(1000).

However, we need to handle those variations which the numerals for 4 (IIII) and 9 (VIIII) are generally replaced with IV (one less than 5) and IX (one less than 10).

Therefore, we need to handle 13 variations in the program.  They are the original 7 symbols with 6 subtractive notations for number 4, 9, 40, 90, 400, 900.

2 arrays are used to store 13 integer values and its corresponding Roman numeral symbols.  The order for these two arrays is very important and it is arranged in descending order.

A string builder is used to store the outcome of Roman symbols.  Using string builder is because symbol is added to the string gradually, and it will not be mutated by next operations.  So it is better to use string builder instead of an empty string.

Caveats:
There is a number range check in the beginning of the program.  If the number is bigger than 400 or less than 0, the program will exit immediately.  

Solution:
The input number is divided by the largest factor first (1000) and the reminder will then become the number for future division and repetitions.  We need to keep track of how many times the number divided as each division is representing a Roman symbol.  
For example, number 3999 is divided by 1000 first for 3 times.  MMM (1000*3) is added to string.  The reminder 999 is divided by 900 (CM) and 90 (XC) and 9 (IX).  Therefore, MMMCMXCIX is added to the string.

Project Classes:
Interface -> /src/main/java/com/bbc/romannumeralgenerator/core/RomanNumeralGenerator;
Implementation class -> /src/main/java/com/bbc/romannumeralgenerator/core/IntegerToRomanGenerator;
Main method -> /src/main/java/com/bbc/romannumeralgenerator/main/IntegerToRomanApplication;
Unit Test -> /src/test/java/com/bbc/romannumeralgenerator/core/IntegerToRomanGeneratorTest;