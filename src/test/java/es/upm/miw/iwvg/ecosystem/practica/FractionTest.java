package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(10, 4);
    }

    @Test
    void testFractionIntInt() {
        fraction = new Fraction(10, 4);
        assertEquals(10, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2.5, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertFalse(fraction.isProper());
        fraction = new Fraction(4, 10);
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(20, 8)));
        assertFalse(fraction.isEquivalent(new Fraction(8, 20)));
    }

    @Test
    void testMultiply() {
        Fraction result = fraction.multiply(new Fraction(4, 5));
        assertEquals(40, result.getNumerator());
        assertEquals(20, result.getDenominator());
    }
}
