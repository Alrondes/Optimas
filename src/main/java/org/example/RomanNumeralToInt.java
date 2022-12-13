package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralToInt {

    public static Integer RomanNumeralT0Int(String InputRomanNumeral) {
        String romanNumeral = InputRomanNumeral;
        int number = 0; //initialize output integer


        Map<Character, Integer> RomanNumerals = new LinkedHashMap<>();
        RomanNumerals.put('I', 1);
        RomanNumerals.put('V', 5);
        RomanNumerals.put('X', 10);
        RomanNumerals.put('L', 50);
        RomanNumerals.put('C', 100);
        RomanNumerals.put('D', 500);
        RomanNumerals.put('M', 1000);


        // checks to add or subtract the Roman Numeral
        for (int i = 0; i < romanNumeral.length(); i++) {
            //Check if the Roman Numeral is greater than or equal to the next Roman Numeral and if so use addition
            //otherwise use subtraction
            if (i+1 == romanNumeral.length() || RomanNumerals.get(romanNumeral.charAt(i)) >= RomanNumerals.get(romanNumeral.charAt(i + 1))) {
                number += RomanNumerals.get(romanNumeral.charAt(i));

            } else {
                number -= RomanNumerals.get(romanNumeral.charAt(i));
            }
        }
        return number;
    }
}
