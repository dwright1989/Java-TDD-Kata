package com.techreturners;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
        LinkedHashMap<Integer, String> romanNumerals = new LinkedHashMap<>();
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
        String result = romanNumerals.get(arabicNumber);
        if((result == null || result.isEmpty())){
            result = "";
           // loop through map to get largest value divisible by from map
            for(Map.Entry<Integer, String> entry : romanNumerals.entrySet()){
                while(entry.getKey()<=arabicNumber){
                        result += entry.getValue();
                    arabicNumber -= entry.getKey();
                }
            }
        }
        
        return result;
    }
}
