package org.numerals.prime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeCalculatorExtensionTest {

    @Test
    @Disabled("Until ready for final checks")
    void validateFinalTest() {
        assertEquals(PrimeCalculatorExtension.countPrimesLowerOrEqualToNumber(1000), 168);
    }

}
