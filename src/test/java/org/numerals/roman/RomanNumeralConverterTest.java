package org.numerals.roman;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConverterTest {

    @Test
    @Disabled("Until ready for final checks")
    void validateFinalTest() {
        assertEquals(RomanNumeralConverter.convertToRomanNumeral(3999), "MMMCMXCIX");
    }

}
