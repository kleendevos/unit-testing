package com.realdolmen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FractionTest {

    private Fraction fraction;


    @Before
    public void init() {
        fraction = new Fraction(5, 10);
    }

    @Test
    public void fractionIsOK() {

        assertEquals(1, fraction.numinator());
        assertEquals(2, fraction.denomintor());
    }

    @Test
    public void testToStringFraction() {
        assertThat(fraction.toString(), equalTo("1/2"));
    }

    @Test
    public void fractionIsSimplified() {
        assertEquals(1, fraction.numinator());
        assertEquals(2, fraction.denomintor());
    }


}
