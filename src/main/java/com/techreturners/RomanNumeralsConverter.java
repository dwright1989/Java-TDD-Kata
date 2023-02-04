package com.techreturners;

import java.util.HashMap;

public class RomanNumeralsConverter {


    /*
         Examples
         1      =   I
         5      =   V
         10     =   X
         50     =   L
         100    =   C
         500    =   D
         1000   =   M
     */

    /* To include subtractive case:

        4       =   IV
        9       =   IX
        40      =   XL
        90      =   XC
        400     =   CD
        900     =   CM

     */

    public String convert(int arabicNumber) {
        // Key/map pairs between original 13 (to include subtractive cases)
        HashMap<Integer, String> romanNumerals = new HashMap<Integer, String>();
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");

        // Check if exists in here, if not, go by digit to digit to get appropriate result
        String result = romanNumerals.get(arabicNumber);
        if(result==null || result.isEmpty()){
            System.out.println("Does not exist in Hashmap.  Need to calculate...");
        }
        
        return result;
    }
}
