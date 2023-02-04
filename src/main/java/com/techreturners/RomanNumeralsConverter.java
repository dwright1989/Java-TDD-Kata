package com.techreturners;

public class RomanNumeralsConverter {
    public String convert(int arabicNumber) {
        String result = "";
        for(int i=0; i<arabicNumber; i++){
            result += "I";
        }
        return result;
    }
}
