package com.realdolmen;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FractionParametrizedTest {

    @Parameterized.Parameter(0)
    public Fraction a;
    @Parameterized.Parameter(1)
    public Fraction b;
    @Parameterized.Parameter(2)
    public Fraction expected;
    @Parameterized.Parameter(3)
    public Fraction expectedsubtract;
    @Parameterized.Parameter(4)
    public Fraction expectedmultiplicator;
    @Parameterized.Parameter(5)
    public Fraction expectedDivider;

    @Parameterized.Parameters
    public static Collection<Fraction[]> params() {
        return Arrays.asList(new Fraction[][]{
                {
                        new Fraction(1, 2),
                        new Fraction(1, 2),
                        new Fraction(1, 1),
                        new Fraction(0, 1),
                        new Fraction(1, 4),
                        new Fraction(1, 1)},

                {
                        new Fraction(3, 5),
                        new Fraction(5, 5),
                        new Fraction(8, 5),
                        new Fraction(-2, 5),
                        new Fraction(3, 5),
                        new Fraction(3, 5)},

                {
                        new Fraction(7, 8),
                        new Fraction(1, 3),
                        new Fraction(29, 24),
                        new Fraction(13, 24),
                        new Fraction(7, 24),
                        new Fraction(7, 2)}
        });
    }

    @Test
    public void addFractions() {
        assertEquals(expected, a.add(b));
    }

    @Test
    public void subtractFractions() {
        assertEquals(expectedsubtract, a.subtract(b));
    }

    @Test
    public void mulitplicatorFractions() {
        assertEquals(expectedmultiplicator, a.multiplication(b));
    }

    @Test
    public void deviderFractions() {
        assertEquals(expectedDivider, a.devider(b));
    }

}




