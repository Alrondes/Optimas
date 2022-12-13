package org.example;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
            Scanner getRomanNumeral = new Scanner(System.in);
            System.out.println("Enter Roman Numeral");
            String romanNumeral = getRomanNumeral.nextLine().toUpperCase();
            Integer returnedNumber = RomanNumeralToInt.RomanNumeralT0Int(romanNumeral);
            System.out.println(returnedNumber);

    }
}