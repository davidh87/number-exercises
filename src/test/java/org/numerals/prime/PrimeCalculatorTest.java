package org.numerals.prime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCalculatorTest {

    @Test
    @Disabled("Until final checks are ready")
    void largePrimeNumberReturnsTrue() {
        assertTrue(PrimeCalculator.isPrime(14071));
    }

    @Test
    @Disabled("Until final checks are ready")
    void largeNonPrimeNumberReturnsFalse() {
        assertFalse(PrimeCalculator.isPrime(14073));
    }

}