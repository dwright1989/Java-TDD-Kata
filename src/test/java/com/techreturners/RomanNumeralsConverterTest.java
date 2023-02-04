package com.techreturners;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {



    @Test
    public void convertOneToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.convert(1));

    }

    @Test
    public void convertFourToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV", romanNumeralsConverter.convert(4));

    }
    @Test
    public void convertFiveToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("V", romanNumeralsConverter.convert(5));

    }
    @Test
    public void convertAllTableToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.convert(1));
        assertEquals("IV", romanNumeralsConverter.convert(4));
        assertEquals("V", romanNumeralsConverter.convert(5));
        assertEquals("IX", romanNumeralsConverter.convert(9));
        assertEquals("X", romanNumeralsConverter.convert(10));
        assertEquals("XL", romanNumeralsConverter.convert(40));
        assertEquals("L", romanNumeralsConverter.convert(50));
        assertEquals("XC", romanNumeralsConverter.convert(90));
        assertEquals("C", romanNumeralsConverter.convert(100));
        assertEquals("CD", romanNumeralsConverter.convert(400));
        assertEquals("D", romanNumeralsConverter.convert(500));
        assertEquals("CM", romanNumeralsConverter.convert(900));
        assertEquals("M", romanNumeralsConverter.convert(1000));


    }

    @Ignore
    public void convertTwoToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));

    }
}
