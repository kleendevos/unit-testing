package com.realdolmen;

/**
 * Created by vdabcursist on 05/07/2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public int numinator () {
        return numerator;
    }

    public int denomintor (){
        return denominator;
    }

    @Override
    public String toString() {
        return (numerator + "/" + denominator);
    }

    private void simplify(){
        int factor = Utilities.greatestCommonFactor(numerator,denominator);
        numerator /= factor;
        denominator /= factor;
    }

}

