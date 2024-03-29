package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        if (this.numerator < this.denominator) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquivalent(Fraction fraction) {
        if (this.numerator / this.denominator == fraction.numerator / fraction.denominator) {
            return true;
        } else {
            return false;
        }
    }

    public Fraction multiply(Fraction fraction) {
        return new Fraction(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
